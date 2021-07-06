public class DeveloperEstagiario extends Developer{
    public DeveloperEstagiario(Developer superior) {
        listaCommit.add(TipoCommitToDevelop.getTipoCommitToDevelop());
        setDeveloperSuperior(superior);
    }
}
