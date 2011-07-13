package s61;
import java.util.*;

public class C {
	public static void main(String[] args) {
		Tree root = new Tree("/");
		for (Scanner s = new Scanner(System.in); s.hasNext();) {
			String[] line = s.next().split("[:\\\\]+");
			Tree n = root;
			for (int i = 0; i < line.length; ++i) {
				Tree t = new Tree(line[i]);
				if (!n.tree.contains(t)) {
					n.tree.add(t);
				} else {
					t = n.tree.get(n.tree.indexOf(t));
				}
				n = t;
			}
		}
		int fmax = 0, dmax = 0;
		for(Tree t : root.tree){
			for(Tree st : t.tree){
				dmax = Math.max(dmax, st.getDirNum()-1);
				fmax = Math.max(fmax, st.getFileNum());
			}
		}
		System.out.println(dmax+" "+fmax);
	}

	static class Tree {
		String name;
		List<Tree> tree;

		public Tree(String name) {
			this.name = name;
			tree = new ArrayList<Tree>();
		}

		int getDirNum() {
			int c = name.matches(".*\\..*")?0:1;
			for (Tree t : tree) {
				c += t.getDirNum();
			}
			return c;
		}

		int getFileNum() {
			int c = name.matches(".*\\..*")?1:0;
			for (Tree t : tree) {
				c += t.getFileNum();
			}
			return c;
		}


		@Override
		public boolean equals(Object obj) {
			return name.equals(((Tree) obj).name);
		}

		@Override
		public String toString() {
			return "[" + name + "," + tree + "]\n";
		}
	}
}
