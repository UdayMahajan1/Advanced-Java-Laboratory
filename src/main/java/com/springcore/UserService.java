package com.springcore;

public class UserService {

    private MessageService messageService;

    // Constructor injection (you could also use setter injection or field injection)
    public UserService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }

}
