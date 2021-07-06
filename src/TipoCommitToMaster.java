public class TipoCommitToMaster implements TipoCommit{
    private static TipoCommitToMaster tipoCommitToMaster = new TipoCommitToMaster();

    public TipoCommitToMaster() {
    }

    public static TipoCommitToMaster getTipoCommitToMaster(){
        return tipoCommitToMaster;
    }
}