//package controller;
//
//import view.LoginView;
//import dao.UserDAO;
//
//import javax.swing.*;
//
//public class LoginController {
//
//    private LoginView view;
//    private UserDAO dao;
//
//    public LoginController(LoginView view, UserDAO dao) {
//        this.view = view;
//        this.dao = dao;
//
//        this.view.loginButton.addActionListener(e -> login());
//    }
//
//    private void login() {
//
//        String username = view.usernameField.getText();
//        String password = new String(view.passwordField.getPassword());
//
//        if (dao.validateUser(username, password)) {
//            JOptionPane.showMessageDialog(view, "Login Successful!");
//        } else {
//            JOptionPane.showMessageDialog(view, "Invalid Username or Password");
//        }
//    }
//}