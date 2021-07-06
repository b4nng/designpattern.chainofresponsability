public class TipoCommitToDevelop implements TipoCommit{
    private static TipoCommitToDevelop tipoCommitToDevelop = new TipoCommitToDevelop();

    public TipoCommitToDevelop() {
    }

    public static TipoCommitToDevelop getTipoCommitToDevelop(){
        return tipoCommitToDevelop;
    }
}
