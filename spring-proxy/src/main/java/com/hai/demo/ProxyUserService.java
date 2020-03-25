package com.hai.demo;

public class ProxyUserService implements UserService{

    private UserServiceImpl userService;

    public ProxyUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public ProxyUserService() {
    }


    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }


    public void log(String msg){
        System.out.println("Debug"+msg);

    }

    public void add() {
        log("调用add");
        userService.add();
    }

    public void delete() {
        log("delete");
    }

    public void update() {
        log("update");
    }

    public void query() {
        log("query");
    }
}
