package com.c07;

public class Final {
    public static void main(String[] args) {

        final int FILE_NEW = 1;
        final int FILE_OPEN = 2;
        final int FILE_SAVE = 3;
        final int FILE_SAVEAS = 4;
        final int FILE_QUIT = 5;

        int option = FILE_OPEN;

        switch (option) {
            case FILE_NEW:
                System.out.println("New file option selected");
                break;
            case FILE_OPEN:
                System.out.println("Open file option selected");
                break;
            case FILE_SAVE:
                System.out.println("Save file option selected");
                break;
            case FILE_SAVEAS:
                System.out.println("Save as file option selected");
                break;
            case FILE_QUIT:
                System.out.println("Quit option selected");
                break;
            default:
                System.out.println("Invalid option selected");
        }
    }
}

/*
 * Open file option selected
 */