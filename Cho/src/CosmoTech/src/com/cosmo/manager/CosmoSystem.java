package com.cosmo.manager;

import java.util.Scanner;

public class CosmoSystem {
	// About Stick
	private int surface, half, one, two, four;
	// About Flag
	private int flagSurface, small, medium, large;

	private int selectWork, selectItem, selectStick, selectFlag;
	private int inputEa;
	private int old;
	private int total;

	public CosmoSystem(int selectWork, int selectItem, int selectStick, int selectFlag, int selectEa) {
		surface = 0;
		half = 0;
		one = 0;
		two = 0;
		four = 0;

		flagSurface = 0;
		small = 0;
		medium = 0;
		large = 0;

		total = 0;
	}

	public void work(int selectWork, int selectItem, int selectStick, int selectFlag, int inputEa) {

		System.out.println("select Work :" + selectWork);
		System.out.println("select Flag :" + selectFlag);
		if (selectWork == 1) {
			if (selectItem == 1) {
				switch (selectStick) {
				case 1:
					// surface
					old = getSurface();
					total = add(old, inputEa);
					setSurface(total);
					break;
				case 2:
					// half
					old = getHalf();
					total = add(old, inputEa);
					setHalf(total);
					break;
				case 3:
					// one
					old = getOne();
					total = add(old, inputEa);
					setOne(total);
					break;
				case 4:
					// two
					old = getTwo();
					total = add(old, inputEa);
					setTwo(total);
					break;
				case 5:
					// four
					old = getFour();
					total = add(old, inputEa);
					setFour(total);
					break;
				}
			} else if (selectItem == 2) {
				switch (selectFlag) {
				case 1:
					// FlagSurface
					old = getFlagSurface();
					total = add(old, inputEa);
					setFlagSurface(total);
					break;
				case 2:
					// small
					old = getSmall();
					total = add(old, inputEa);
					setSmall(total);
					break;
				case 3:
					// medium
					old = getMedium();
					total = add(old, inputEa);
					setMedium(total);
					break;
				case 4:
					// large
					old = getLarge();
					total = add(old, inputEa);
					setLarge(total);
					break;
				}
			} else {
				System.out.println("Failed Error");
			}
			System.out.println("Success Input Data");
		} else if (selectWork == 2) {
			if(selectItem == 1) {
				switch (selectStick) {
				case 1:
					// surface
					old = getSurface();
					total = sub(old, inputEa);
					setSurface(total);
					break;
				case 2:
					// half
					old = getHalf();
					total = sub(old, inputEa);
					setHalf(total);
					break;
				case 3:
					// one
					old = getOne();
					total = sub(old, inputEa);
					setOne(total);
					break;
				case 4:
					// two
					old = getTwo();
					total = sub(old, inputEa);
					setTwo(total);
					break;
				case 5:
					// four
					old = getFour();
					total = sub(old, inputEa);
					setFour(total);
					break;
				}
			} else if(selectItem == 2) {

				switch (selectFlag) {
				case 1:
					// FlagSurface
					old = getFlagSurface();
					total = sub(old, inputEa);
					setFlagSurface(total);
					break;
				case 2:
					// small
					old = getSmall();
					total = sub(old, inputEa);
					setSmall(total);
					break;
				case 3:
					// medium
					old = getMedium();
					total = sub(old, inputEa);
					setMedium(total);
					break;
				case 4:
					// large
					old = getLarge();
					total = sub(old, inputEa);
					setLarge(total);
					break;
				}
				
			}
			System.out.println("Success Input Data");
		} else {
			System.out.println("Failed");
		}
	}

	public int add(int old, int newEa) {
		int result = old + newEa;

		return result;
	}

	public int sub(int old, int newEa) {
		int result = old - newEa;
		return result;
	}

	public void selectedFlag(int selectFlag, int ea) {
		switch (selectFlag) {

		}
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public int getHalf() {
		return half;
	}

	public void setHalf(int half) {
		this.half = half;
	}

	public int getOne() {
		return one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getTwo() {
		return two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	public int getFour() {
		return four;
	}

	public void setFour(int four) {
		this.four = four;
	}

	public int getFlagSurface() {
		return flagSurface;
	}

	public void setFlagSurface(int flagSurface) {
		this.flagSurface = flagSurface;
	}

	public int getSmall() {
		return small;
	}

	public void setSmall(int small) {
		this.small = small;
	}

	public int getMedium() {
		return medium;
	}

	public void setMedium(int medium) {
		this.medium = medium;
	}

	public int getLarge() {
		return large;
	}

	public void setLarge(int large) {
		this.large = large;
	}

	public int getSelectWork() {
		return selectWork;
	}

	public void setSelectWork(int selectWork) {
		this.selectWork = selectWork;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSelectItem() {
		return selectItem;
	}

	public void setSelectItem(int selectItem) {
		this.selectItem = selectItem;
	}

	@Override
	public String toString() {
		String info = "";
		info += "=================현재 봉부자 현황=========================\n";
		info += "============봉부자=====================깃발==============\n";
		info += "[표면 부자] : " + getSurface() + "\t [표면 깃발] : " + getFlagSurface() + "\n";
		info += "[0.5   M] : " + getHalf() + "\t [ 소  깃발] : " + getSmall() + "\n";
		info += "[  1   M] : " + getOne() + "\t [ 중  깃발] : " + getMedium() + "\n";
		info += "[  2   M] : " + getTwo() + "\t [ 대  깃발] : " + getLarge() + "\n";
		info += "[  4   M] : " + getFour() + "\t [ 비   고 ]\n";
		info += "==========================================================\n";
		return info;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int selectWork = 0;
		int selectItem = 0;
		int selectStick = 0;
		int selectFlag = 0;
		int inputEa = 0;
		CosmoSystem cs = new CosmoSystem(selectWork, selectItem, selectStick, selectFlag, inputEa);
		while (true) {
			while (true) {
				System.out.println("작업을 선택해 주십시오.");
				System.out.println("1. 추가  2. 삭제");
				selectWork = scan.nextInt();
				if (!(selectWork == 1 || selectWork == 2)) {
					System.out.println("잘 못 입력하셨네요 다시 입력해 주십시오.");
					System.out.println("1. 추가  2. 삭제");
					selectWork = scan.nextInt();
				} else {
					break;
				}
			}

			while (true) {
				System.out.println("아이템을 선택해 주십시오.");
				System.out.println("1. 봉부자 2. 깃발");
				selectItem = scan.nextInt();
				if (!(selectWork == 1 || selectWork == 2)) {
					System.out.println("잘 못 입력하셨네요 다시 입력해 주십시오.");
					System.out.println("1. 봉부자 2. 깃발");
					selectItem = scan.nextInt();
				} else {
					break;
				}
			}

			while (true) {

				if (selectItem == 1) {
					System.out.println("봉부자 단위를 선택해 주십시오.");
					System.out.println("1. 표면	 2. 0.5m   3. 1m  4. 2m	 5. 4m");
					selectStick = scan.nextInt();
					selectFlag = 0;
					break;
				} else if (selectItem == 2) {
					System.out.println("깃발 단위를 선택해 주십시오.");
					System.out.println("1. 표면	 2. 소   3. 중   4. 대");
					selectStick = 0;
					selectFlag = scan.nextInt();
					break;
				} else {
					System.out.println("선택을 잘 못 하셨습니다.");
					continue;
				}
			}

			while (true) {
				System.out.print("개수를 입력해 주세요 : ");
				inputEa = scan.nextInt();
				if (inputEa < 0) {
					System.out.println("잘 못 입력하셨네요 다시 입력해 주십시오.");
					System.out.print("개수를 입력해 주세요 : ");
					inputEa = scan.nextInt();
				} else {
					break;
				}

			}

			cs.work(selectWork, selectItem, selectStick, selectFlag, inputEa);
			// 작업이 성공시에 성공 멘트를 실패시엔 실패 멘트
			System.out.println(cs.toString());
		}
	}
}
