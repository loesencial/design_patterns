package ChoreExample;

public interface IChore {
    void setChoreName(String choreName);

    void setOwner(IPerson person);

    void performWork(double hours);

    void completeChore();
}
