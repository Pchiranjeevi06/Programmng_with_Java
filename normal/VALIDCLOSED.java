package normal;

class VALIDCLOSED {
    public static boolean isValid(String s) {
        StringBuilder stack = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.append(ch);
                    break;
                case ')':
                    if (stack.length() == 0 || stack.charAt(stack.length()-1) != '(') {
                        return false;
                    }
                    stack.deleteCharAt(stack.length()-1);
                    break;
                case ']':
                    if (stack.length() == 0 || stack.charAt(stack.length()-1) != '[') {
                        return false;
                    }
                    stack.deleteCharAt(stack.length()-1);
                    break;
                case '}':
                    if (stack.length() == 0 || stack.charAt(stack.length()-1) != '{') {
                        return false;
                    }
                    stack.deleteCharAt(stack.length()-1);
                    break;
                default:
                    return false;
            }
        }
        return stack.length() == 0;
    }
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
