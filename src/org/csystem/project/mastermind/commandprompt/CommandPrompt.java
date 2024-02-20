package org.csystem.project.mastermind.commandprompt;

import java.util.Scanner;

import org.csystem.util.string.StringUtil;

public class CommandPrompt {
    public static String[] commandStr = { "length", "reverse", "upper", "lower" };
    public String prompt;
    public Scanner kb;

    public static boolean isAvailable(String[] cmdInfo) {
        boolean bool = false;
        if (cmdInfo[1].startsWith("\"") && cmdInfo[1].endsWith("\"")) {
            bool = true;
        }
        return bool;
    }

    public static void lengthProc(String[] cmdInfo) {

        if (cmdInfo.length != 2) {
            System.out.println("Length bir tane argüman almalıdır");
            return;
        } else if (!isAvailable(cmdInfo)) {
            System.out.println("Geçersiz argüman girişi");
        } else {
            System.out.println(cmdInfo[1].length() - 2);
        }

    }

    public static void reverseProc(String[] cmdInfo) {

        if (cmdInfo.length != 2) {
            System.out.println("Reverse bir tane argüman almalıdır");
            return;
        } else if (!isAvailable(cmdInfo)) {
            System.out.println("Geçersiz argüman girişi");
        } else {
            System.out.println(StringUtil.reversed(cmdInfo[1]));
        }

    }

    public static void upperProc(String[] cmdInfo) {

        if (cmdInfo.length != 2) {
            System.out.println("Upper bir tane argüman almalıdır");
            return;
        } else if (!isAvailable(cmdInfo)) {
            System.out.println("Geçersiz argüman girişi");
        } else {
            System.out.println(cmdInfo[1].toUpperCase());

        }

    }

    public static void lowerProc(String[] cmdInfo) {

        if (cmdInfo.length != 2) {
            System.out.println("Lower bir tane argüman almalıdır");
            return;
        } else if (!isAvailable(cmdInfo)) {
            System.out.println("Geçersiz argüman girişi");
        } else {
            System.out.println(cmdInfo[1].toLowerCase());
        }

    }

    public static String getCommandByText(String text) {
        if (text.length() < 3)
            return "";

        for (int i = 0; i < commandStr.length; i++)
            if (commandStr[i].startsWith(text))
                return commandStr[i];

        return "";

    }

    public void doWorkForCommand(String[] cmdInfo) {
        switch (cmdInfo[0]) {
            case "length":
                lengthProc(cmdInfo);
                break;
            case "reverse":
                reverseProc(cmdInfo);
                break;
            case "upper":
                upperProc(cmdInfo);
                break;
            case "lower":
                lowerProc(cmdInfo);
                break;

        }

    }

    public void parseCommand(String[] cmdInfo) {
        String cmdText = getCommandByText(cmdInfo[0]);

        if (!cmdText.isEmpty()) {
            cmdInfo[0] = cmdText;
            doWorkForCommand(cmdInfo);

        } else
            System.out.println("Geçersiz Komut");

    }

    public CommandPrompt(String prompt) {
        this.prompt = prompt;
        kb = new Scanner(System.in);

    }

    public void run() {
        System.out.println("Homework-013 sorusu");

        for (;;) {
            System.out.print(prompt + ">");
            String cmdText = kb.nextLine().trim();

            if ("quit".equals(cmdText)) {
                break;
            }

            parseCommand(cmdText.split("[ \t]+"));

        }

        System.out.println("Tekrar Yapıyor Musunuz?");
    }

}
