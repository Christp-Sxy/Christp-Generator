package com.christp;

import com.christp.cli.CommandExecutor;

import java.io.File;

import static com.christp.generator.StaticGenerator.copyFilesByHutool;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}