package com.hohm;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hohm.models.MemeRoom;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Json {

    private static ObjectMapper objectMapper = getDefaultObjectMapper();

    private static ObjectMapper getDefaultObjectMapper(){
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        return defaultObjectMapper;
    }

    public static JsonNode parse(InputStream file) throws IOException {
        return  objectMapper.readTree(file);
    }

    //allows you to parse a JSON file and create an object from the information in the JSON file
    public static Map<String, MemeRoom> generateRooms() throws IOException {
        //String pathName = String.format("src/main/resources/%s.json",roomName);
        String[] rooms = {"hallway", "kitchen", "livingroom", "diningroom", "basement" };

        //Reading the rooms.json file and generating a list of rooms
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream file = classLoader.getResourceAsStream("rooms.json");
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(file);
        Map<String, MemeRoom> roomMap = new HashMap<>();

        //Populating the arraylist with the room objects
        for (int i = 0; i< rooms.length;i++) {
            JsonNode roomNode = rootNode.path(rooms[i]);
            roomMap.put(rooms[i], objectMapper.convertValue(roomNode, MemeRoom.class));
        }
        return roomMap;
    }
}
