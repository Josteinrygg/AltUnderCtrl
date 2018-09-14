package Klasser;
import java.sql.Connection;
import java.sql.DriverManager;

//Table for elever og lærere
//Person ID (PK) = p_id
//Rolle = p_role //om personen er teacher eller student(/TA?)
//Email = p_email
//Tlf = p_phone
//Login og password?
public class UserHandler {
    public static void main(String[] args){
        try(
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/slit", "root", "Chah1thA"
        );
        )
    }
    public void Create(int p_id, String user, String password, String email,
                       String role, int phone){

    }


}
