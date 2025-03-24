package pilhas;

public class PilhaInt {

    final int N = 7;
    int[] dados = new int[N];
    private int topo;

    public void init() {
        topo = 0;
    }

    public boolean isFull() {
        return (topo == N);
    }

    public boolean isEmpty() {
        return (topo == 0);
    }

    public void push(int elem) {
        if (isFull())
            System.out.println("Stack overflow");
        else {
            dados[topo] = elem;
            topo++;
        }
    }

    public int pop() {
        topo--;
        return (dados[topo]);
    }

	public int top() {
		if(topo == 0) {
			System.out.println("Stack is empty!");
			return -1;
		}

		return (dados[topo-1]);
	}

	public void clear() {
		while(!(this.isEmpty())) {
			System.out.print(this.pop() + " ");
		}
	}
}

