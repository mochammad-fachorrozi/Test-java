package org.acme.rest.json;

        import java.util.Collections;
        import java.util.LinkedHashMap;
        import java.util.List;
        import java.util.Set;
        import java.util.stream.Collectors;

        import javax.ws.rs.*;

@Path("/students")
public class StudentResource {

    private Set<Student> students = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public StudentResource() {
        students.add(new Student("Andre", "Kelas 1"));
        students.add(new Student("Eko", "Kelas 2"));
        students.add(new Student("Heri", "Kelas 3"));
    }

//    show all
    @GET
    public Set<Student> list() {
        return students;
    }

//    show by name
    @GET
    public List<Student> getStudent(@HeaderParam("name") String name) {
        return students.stream().filter(n -> n.name.equals(name)).collect(Collectors.toList());
    }

//    add
    @POST
    public Set<Student> add(Student student) {
        students.add(student);
        return students;
    }

//    delete
    @DELETE
    public Set<Student> delete(@QueryParam("name") String name) {
        students.removeIf(existingStudent -> existingStudent.name.contentEquals(name));
        return students;
    }

//  update
    @PUT
    @Path("/{name}")
    public Set<Student> update(@PathParam("name") String name,Student student) {
        students.removeIf(existingStudent -> existingStudent.name.contentEquals(name));
        students.add(student);
        return students;
    }
}
