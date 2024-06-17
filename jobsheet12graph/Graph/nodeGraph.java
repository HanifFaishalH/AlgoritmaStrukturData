package jobsheet12graph.Graph;

public class nodeGraph {
    int data, jarak;
    nodeGraph prev, next;

    nodeGraph() {
        
    }

    nodeGraph (nodeGraph prev, int data, int jarak, nodeGraph next) {
        this.prev=prev;
        this.data=data;
        this.jarak=jarak;
        this.next=next;
    }
}
