public class TipoCommitToPreprod implements TipoCommit{
    private static TipoCommitToPreprod tipoCommitToPreprod = new TipoCommitToPreprod();

    public TipoCommitToPreprod() {
    }

    public static TipoCommitToPreprod getTipoCommitToPreprod(){
        return tipoCommitToPreprod;
    }
}
