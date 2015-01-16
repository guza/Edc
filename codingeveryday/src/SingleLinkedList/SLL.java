package SingleLinkedList;

public class SLL {
	
	private Node header;
	private int size;
	
	public SLL()
	{
		header = new Node(null);
		size = 0;
	}
	
	private class Node
	{
		private Object data;
		private Node nextNode;
		
		Node(Object data)
		{
			this.data = data;
			this.nextNode = null;
		}
	}
	//////////////////////////////
	//////////////////////////////
	
	public void addFirst(Object data)
	{
		Node tmp = new Node(data); //��Ÿ���� 
		tmp.nextNode = header.nextNode; // 
		header.nextNode = tmp;// ���� ���� �Ҷ� ó�� �ϳ���. 
		size++;
	}
	
	/*public void addLast(Object data)
	{
		Node iter = header.nextNode;
		while( iter.nextNode !=null)
			{
				if(iter.nextNode.nextNode == null)
				{
					System.out.println("?");
					Node tmp = new Node(data);
					iter.nextNode.nextNode = tmp;
				}
				iter = iter.nextNode;
			}
	}*/ //�� �ܲ� �θ��ٰ� ���ѷ����� �����η���. .
	
	public Object get(int index)
	{
		return getNode(index).data;
	}
	
	public Node getNode(int index)
	{
		if(index<0 || index>=size)
		{
			throw new IndexOutOfBoundsException("index error");
		}
		Node node = header.nextNode;
		
		//��.. �ű������ ���� �� ��带 ��ȯ�ϴ±���.. ����. 
		for ( int i = 0; i<index; i++)
		{
			node = node.nextNode;
		}
		return node;
	}
	
	public String toString()
	{
		StringBuffer result = new StringBuffer("[");
		Node node = header.nextNode;
		
		if(node !=null)
		{
			result.append(node.data);
			node = node.nextNode;
			
			while(node!= null)
			{
				result.append(", ");
				result.append(node.data);
				node = node.nextNode;
			}
		}
		result.append("]");
		return result.toString();
	}
	
	public void removeFirst ()
	{
		Node tmp = header.nextNode;
		header.nextNode = tmp.nextNode;
		//���m�� ���� �ٵǴ°ž�. �̻��ѻ���������. 
	}
	
	public static void main(String[] args) {
		SLL sll = new SLL();		
		sll.addFirst(100);
		sll.addFirst(200);
		sll.addFirst(300);
		//sll.addLast(400);
		//sll.removeFirst();
		System.out.println(sll);
		System.out.println("o_o");
	}
}
