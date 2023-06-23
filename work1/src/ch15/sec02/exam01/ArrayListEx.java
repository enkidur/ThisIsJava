package ch15.sec02.exam01;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		int size = list.size();
		System.out.println("총 객체 수: "+size);
		System.out.println();
		
		Board board = list.get(2);
		System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());
		System.out.println();

		for(Board temp : list) {
			System.out.println(temp.getSubject()+"\t"+temp.getContent()+"\t"+temp.getWriter());
		}
		
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		
		for(Board temp : list) {
			System.out.println(temp.getSubject()+"\t"+temp.getContent()+"\t"+temp.getWriter());
		}
		
	}

}
