package com.bancoequidad.services;

import com.bancoequidad.Enum.MaritalStatus;
import com.bancoequidad.models.Client;

import java.io.PrintStream;
import java.util.Scanner;

public class BankService {
    private PrintStream printStream;
    private Scanner scanner;
    private BankDomainService bankDomainService;

    public BankService(PrintStream printStream, Scanner scanner, BankDomainService bankDomainService) {
        this.printStream = printStream;
        this.scanner = scanner;
        this.bankDomainService = bankDomainService;
    }

    public void showMenu() {
        printStream.println("------------Menu------------");
        printStream.println("1 Register client");
        printStream.println("2 Register account");
        printStream.println("3 Assign account to client");
        printStream.println("4 Make deposit in a account");
        printStream.println("5 Make withdrawal of a account");
        printStream.println("6 Make transfer");
        printStream.println("7 Print a client detail");
        printStream.println("0 Exist");
        printStream.println("Choose an option");

        int option = scanner.nextInt();

        if (option == 1) {
            showMenuClientRegistration();

        }

    }


    private void showMenuClientRegistration() {
        int maritalStatusOptions = scanner.nextInt();
        MaritalStatus maritalStatus;
        printStream.println("-----------Enter the client detail-----------\n");
        printStream.println("Enter your Id");
        String id = scanner.next();
        printStream.println("Enter your name");
        String name = scanner.next();
        printStream.println("Choose your marital status");
        printStream.println("1. Married");
        printStream.println("2. Singled");
        printStream.println("3. Divorced");
        printStream.println("4. Others");
        maritalStatusOptions = scanner.nextInt();

        if (maritalStatusOptions == 1) {
            maritalStatus = MaritalStatus.MARRIED;
        } else if (maritalStatusOptions == 2) {
            maritalStatus = MaritalStatus.SINGLE;
        }else if (maritalStatusOptions == 3) {
            maritalStatus = MaritalStatus.DIVORCED;
        } else {
            maritalStatus = MaritalStatus.OTHERS;
        }
        //bankDomainService.createClient(id, name, maritalStatus);
        System.out.println("Successful registration\n");
    }
}