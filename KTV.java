package test__;


	import java.util.LinkedList;
	import java.util.Scanner;
	public class KTV {
	    public static void main(String[] args) {
	        talk();
	        arr();
	        rund(arr());
	    }

	    public static void talk() {
	        System.out.println("---------------欢迎来到点歌系统---------------");
	        System.out.println("0.添加歌曲至列表");
	        System.out.println("1.将歌曲置顶");
	        System.out.println("2.将歌曲前移一位");
	        System.out.println("3.退出");
	        System.out.println("初始列表为:" + arr());
	        rund(arr());
	    }


	    static LinkedList arr() {
	        LinkedList link = new LinkedList();
	        link.add("稻香");
	        link.add("夜曲");
	        link.add("夜的第七章");
	        link.add("听妈妈的话");
	        link.add("龙卷风");
	        return link;
	    }

	    static void rund(LinkedList link) {
	        // arr();
	        System.out.print("请输入要执行的序号:");
	        Scanner str = new Scanner(System.in);
	        int num = str.nextInt();
	        while (num < 10) {
	            if (num == 0) {
	                System.out.print("请输入要添加的歌曲名称:");
	                Scanner song = new Scanner(System.in);
	                String song1 = song.next();
	                link.addLast(song1);
	                System.out.println("已添加歌曲："+song1);
	                System.out.println("当前列表为:" + link);
	            }
	            if (num == 1) {
	                System.out.print("请输入要置顶的歌曲名称:");
	                Scanner song = new Scanner(System.in);
	                String song1 = song.next();
	                for (int i = 0; i < link.size(); i++) {
	                    String object = (String) link.get(i);
	                    if (object.contains(song1)) {
	                        link.remove(i);
	                        link.addFirst(song1);
	                        System.out.println("已置顶歌曲："+song1);
	                        System.out.println("当前列表为:" + link);
	                    }
	                }
	                }
	            if (num == 2) {
	                System.out.print("请输入要前移的歌曲名称:");
	                Scanner song = new Scanner(System.in);
	                String song1 = song.next();
	                for (int i = 0; i < link.size(); i++) {
	                    String object = (String) link.get(i);
	                    if (object.contains(song1)) {
	                        link.remove(i);
	                        link.add(i-1,object);
	                        System.out.println("已前移歌曲："+song1);
	                        System.out.println("当前列表为:" + link);

	                    }
	                    }
	                }
	            if (num == 3) {
	                System.out.println("---------------退出--------------");
	                System.out.println("你已退出系统");
	                System.exit(0);
	            }
	            System.out.print("请输入要执行的序号:");
	            str = new Scanner(System.in);
	            num = str.nextInt();
	        }
	    }
	}


