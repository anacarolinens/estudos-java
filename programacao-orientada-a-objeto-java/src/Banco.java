import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Banco {
    
    private String nome;
    private List<Conta> contas;

    public List<Conta> geContas(){
        return contas;
    }
    
}
