// Factory Pattern: Member Factory for creating different types of members
public class MemberFactory {
    public static Member createMember(String type, String name) {
        if (type.equalsIgnoreCase("student")) {
            return new StudentMember(name);
        } else if (type.equalsIgnoreCase("faculty")) {
            return new FacultyMember(name);
        }
        return null;
    }
}
