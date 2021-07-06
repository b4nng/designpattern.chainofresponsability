public class DeveloperGerente extends Developer{
    public DeveloperGerente(Developer superior) {
        listaCommit.add(TipoCommitToDevelop.getTipoCommitToDevelop());
        listaCommit.add(TipoCommitToPreprod.getTipoCommitToPreprod());
        listaCommit.add(TipoCommitToMaster.getTipoCommitToMaster());
        setDeveloperSuperior(superior);
    }
}