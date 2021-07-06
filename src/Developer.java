import java.util.ArrayList;

public abstract class Developer {
    protected ArrayList listaCommit = new ArrayList();
    private Developer developerSuperior;

    public ArrayList getListaCommit() {
        return listaCommit;
    }

    public void setListaCommit(ArrayList listaCommit) {
        this.listaCommit = listaCommit;
    }

    public Developer getDeveloperSuperior() {
        return developerSuperior;
    }

    public void setDeveloperSuperior(Developer developerSuperior) {
        this.developerSuperior = developerSuperior;
    }

    public String commit(Commit commit){
        if (listaCommit.contains(commit.getCommit())){
            return "Commit executado sem permissões adicionais";
        }
        else {
            if (developerSuperior != null){
                developerSuperior.commit(commit);
            }
            else{
                return "Commit não executado";
            }
        }
    }
}
