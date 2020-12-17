class Primitive {
    public static boolean toPrimitive(Boolean b) {
        try {
            if (b.equals(Boolean.TRUE)) {
                return b;
            }
        } catch (NullPointerException e) {
            return false;
        }

        return b;
    }
}
