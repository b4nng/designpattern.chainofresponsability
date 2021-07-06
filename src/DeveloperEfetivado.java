public class DeveloperEfetivado extends Developer{
    public DeveloperEfetivado(Developer superior) {
        listaCommit.add(TipoCommitToDevelop.getTipoCommitToDevelop());
        listaCommit.add(TipoCommitToPreprod.getTipoCommitToPreprod());
        setDeveloperSuperior(superior);
    }
}