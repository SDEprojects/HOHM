package com.hohm;

public class GameStart {

    public static void main(String[] args) throws Exception {

        String title = "'##::::'##::'#######::'##::::'##::'######::'########:::::'#######::'########:                                                    \n" +
                " ##:::: ##:'##.... ##: ##:::: ##:'##... ##: ##.....:::::'##.... ##: ##.....::                                                    \n" +
                " ##:::: ##: ##:::: ##: ##:::: ##: ##:::..:: ##:::::::::: ##:::: ##: ##:::::::                                                    \n" +
                " #########: ##:::: ##: ##:::: ##:. ######:: ######:::::: ##:::: ##: ######:::                                                    \n" +
                " ##.... ##: ##:::: ##: ##:::: ##::..... ##: ##...::::::: ##:::: ##: ##...::::                                                    \n" +
                " ##:::: ##: ##:::: ##: ##:::: ##:'##::: ##: ##:::::::::: ##:::: ##: ##:::::::                                                    \n" +
                " ##:::: ##:. #######::. #######::. ######:: ########::::. #######:: ##:::::::                                                    \n" +
                "..:::::..:::.......::::.......::::......:::........::::::.......:::..::::::::                                                    \n" +
                "'##::::'##::::'###::::'##::::'##:'##::: ##:'########:'########:'########:::::'##::::'##:'########:'##::::'##:'########::'######::\n" +
                " ##:::: ##:::'## ##::: ##:::: ##: ###:: ##:... ##..:: ##.....:: ##.... ##:::: ###::'###: ##.....:: ###::'###: ##.....::'##... ##:\n" +
                " ##:::: ##::'##:. ##:: ##:::: ##: ####: ##:::: ##:::: ##::::::: ##:::: ##:::: ####'####: ##::::::: ####'####: ##::::::: ##:::..::\n" +
                " #########:'##:::. ##: ##:::: ##: ## ## ##:::: ##:::: ######::: ##:::: ##:::: ## ### ##: ######::: ## ### ##: ######:::. ######::\n" +
                " ##.... ##: #########: ##:::: ##: ##. ####:::: ##:::: ##...:::: ##:::: ##:::: ##. #: ##: ##...:::: ##. #: ##: ##...:::::..... ##:\n" +
                " ##:::: ##: ##.... ##: ##:::: ##: ##:. ###:::: ##:::: ##::::::: ##:::: ##:::: ##:.:: ##: ##::::::: ##:.:: ##: ##:::::::'##::: ##:\n" +
                " ##:::: ##: ##:::: ##:. #######:: ##::. ##:::: ##:::: ########: ########::::: ##:::: ##: ########: ##:::: ##: ########:. ######::\n" +
                "..:::::..::..:::::..:::.......:::..::::..:::::..:::::........::........::::::..:::::..::........::..:::::..::........:::......:::\n";
        for (int i = 0; i<title.length(); i++) {
            System.out.print(title.charAt(i));
        }
        UtilLoader.intro();
        UtilLoader.help();
        GameRunner.gameInit();

    }
}
