public class DeveloperGerente extends Developer{
    public DeveloperGerente() {
        listaCommit.add(TipoCommitToDevelop.getTipoCommitToDevelop());
        listaCommit.add(TipoCommitToPreprod.getTipoCommitToPreprod());
        listaCommit.add(TipoCommitToMaster.getTipoCommitToMaster());
    }
}