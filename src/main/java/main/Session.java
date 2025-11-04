package main;

public class Session {
    private static int userId;
    private static String username;
    private static String role;

    public static void setUserId(int id) {
        userId = id;
    }

    public static int getUserId() {
        return userId;
    }

    public static void setUsername(String name) {
        username = name;
    }

    public static String getUsername() {
        return username;
    }

    public static void setRole(String r) {
        role = r;
    }

    public static String getRole() {
        return role;
    }

    public static void clearSession() {
        userId = 0;
        username = null;
        role = null;
    }
}
