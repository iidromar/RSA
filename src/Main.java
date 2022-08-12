import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int Counter =0;
		int temp = 0;
		int MessageCounter = 0;
		int tester = 0;
		
		System.out.println(" ---------- I N P U T S --------------");
		System.out.println("Please give the key: ");
		
		Scanner inputOfUser = new Scanner(System.in);
		String inputUserKey = inputOfUser.nextLine();
		
		System.out.println("Please give the message: ");
		String InputMessage = inputOfUser.nextLine();
		
		char[] UserArrayInput = new char[inputUserKey.length()];
        char[] messageArray = new char[InputMessage.length()];
        
		
		while(temp < UserArrayInput.length) {
			char part = inputUserKey.charAt(temp);
			if (part != ' ') {
				UserArrayInput[Counter++] = part;
			}
			temp++;
		}
		
		
		while(tester < messageArray.length) {
			char partFrom = InputMessage.charAt(tester);
			if (partFrom != ' ') {
				messageArray[MessageCounter++] = partFrom;
			}
			tester++;
		}
		
		
		System.out.println("\n\n\n---------- R E S U L T S -------------------");
		System.out.println("Key = " + inputUserKey);
		System.out.println("message = " + InputMessage);
		System.out.println("ciphertext = " + makeMessageCipher(UserArrayInput, messageArray) );
	}

	public static char[] firstPermutation(char[] key) {
		try {
		int[] permut1 = new int[56];
		char[] permut1After = new char[56];
		permut1[0] = 57; permut1[1] = 49; permut1[2] = 41; permut1[3] = 33; permut1[4] = 25; permut1[5] = 17; permut1[6] = 9; permut1[7] = 1;
		permut1[8] = 58; permut1[9] = 50; permut1[10] = 42; permut1[11] = 34; permut1[12] = 26;	permut1[13] = 18; permut1[14] = 10; permut1[15] = 2;
		permut1[16] = 59; permut1[17] = 51; permut1[18] = 43; permut1[19] = 35; permut1[20] = 27; permut1[21] = 19;permut1[22] = 11; permut1[23] = 3;
		permut1[24] = 60; permut1[25] = 52; permut1[26] = 44; permut1[27] = 36; permut1[28] = 63; permut1[29] = 55; permut1[30] = 47; permut1[31] = 39;
		permut1[32] = 31; permut1[33] = 23; permut1[34] = 15; permut1[35] = 7; permut1[36] = 62; permut1[37] = 54; permut1[38] = 46; permut1[39] = 38; 
		permut1[40] = 30; permut1[41] = 22; permut1[42] = 14; permut1[43] = 6; permut1[44] = 61; permut1[45] = 53; permut1[46] = 45; permut1[47] = 37;
		permut1[48] = 29; permut1[49] = 21; permut1[50] = 13; permut1[51] = 5; permut1[52] = 28; permut1[53] = 20; permut1[54] = 12; permut1[55] = 4;
		int i = 0;
		while(i<56) {
			int x = permut1[i];
			permut1After[i] = key[x - 1];
			i++;
		}
		return permut1After;
		}catch(Exception gg) {
			return new char[1];
		}
	}
	public static char[] lastPermutation(char[] messageF) {
		try {
		int[] per = new int[64];
		char[] mAfterPer = new char[64];
		per[0] = 40;per[1] = 8; per[2] = 48; per[3] = 16; per[4] = 56; per[5] = 24; per[6] = 64; per[7] = 32; per[8] = 39;
		per[9] = 7; per[10] = 47; per[11] = 15; per[12] = 55; per[13] = 23; per[14] = 63; per[15] = 31; per[16] = 38;
		per[17] = 6; per[18] = 46; per[19] = 14; per[20] = 54; per[21] = 22; per[22] = 62; per[23] = 30; per[24] = 37;
		per[25] = 5; per[26] = 45; per[27] = 13; per[28] = 53; per[29] = 21; per[30] = 61; per[31] = 29; per[32] = 36; per[33] = 4;
		per[34] = 44; per[35] = 12; per[36] = 52; per[37] = 20; per[38] = 60; per[39] = 28; per[40] = 35; per[41] = 3;
		per[42] = 43; per[43] = 11; per[44] = 51; per[45] = 19;	per[46] = 59; per[47] = 27; per[48] = 34; per[49] = 2; per[50] = 42;
		per[51] = 10; per[52] = 50; per[53] = 18; per[54] = 58; per[55] = 26; per[56] = 33; per[57] = 1; per[58] = 41;
		per[59] = 9; per[60] = 49; per[61] = 17; per[62] = 57; per[63] = 25;
		int i =0;
		while(i<64) {
			int x = per[i];
			mAfterPer[i] = messageF[x - 1];
			i++;
		}
		return mAfterPer;
		}catch(Exception gg) {
			return new char[1];
		}
	}
        public static char[] shiftToLeft(int n, char[] key) {
        	try {
		for (int i = 0; i < n; i++) {
			char tester = key[0];
			for (int j = 0; j < key.length - 1; j++) {
				key[j] = key[j + 1];
			}
			key[key.length - 1] = tester;
		}
		return key;
        	}catch(Exception gg) {
    			return new char[1];
    		}
	}

	public static char[] messageFirstPermutation(char[] message) {
		try {
		int[] per = new int[64];
		char[] messageAfterP = new char[64];
		per[0] = 58; per[1] = 50; per[2] = 42; per[3] = 34; per[4] = 26; per[5] = 18; per[6] = 10; per[7] = 2; per[8] = 60; per[9] = 52;
		per[10] = 44; per[11] = 36; per[12] = 28; per[13] = 20; per[14] = 12; per[15] = 4; per[16] = 62; per[17] = 54; per[18] = 46;
		per[19] = 38; per[20] = 30; per[21] = 22; per[22] = 14; per[23] = 6; per[24] = 64; per[25] = 56; per[26] = 48; per[27] = 40;
		per[28] = 32; per[29] = 24; per[30] = 16; per[31] = 8; per[32] = 57; per[33] = 49; per[34] = 41; per[35] = 33; per[36] = 25;
		per[37] = 17; per[38] = 9; per[39] = 1; per[40] = 59; per[41] = 51; per[42] = 43; per[43] = 35; per[44] = 27; per[45] = 19;
		per[46] = 11; per[47] = 3; per[48] = 61; per[49] = 53; per[50] = 45; per[51] = 37; per[52] = 29; per[53] = 21; per[54] = 13;
		per[55] = 5; per[56] = 63; per[57] = 55; per[58] = 47; per[59] = 39; per[60] = 31; per[61] = 23; per[62] = 15; per[63] = 7;
		
		int i =0;
		while(i<64) {
			int x = per[i];
			messageAfterP[i] = message[x - 1];
			i++;
		}
		return messageAfterP;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] ExpantionTheMessage(char[] R) {
		try {
		int[] permut = new int[48];
		char[] pAfter = new char[48];
		permut[0] = 32; permut[1] = 1; permut[2] = 2; permut[3] = 3; permut[4] = 4; permut[5] = 5; permut[6] = 4; permut[7] = 5;
		permut[8] = 6; permut[9] = 7; permut[10] = 8; permut[11] = 9; permut[12] = 8; permut[13] = 9; permut[14] = 10; permut[15] = 11;
		permut[16] = 12; permut[17] = 13; permut[18] = 12; permut[19] = 13; permut[20] = 14; permut[21] = 15; permut[22] = 16; 
		permut[23] = 17; permut[24] = 16; permut[25] = 17; permut[26] = 18; permut[27] = 19; permut[28] = 20; permut[29] = 21;
		permut[30] = 20; permut[31] = 21; permut[32] = 22;permut[33] = 23; permut[34] = 24; permut[35] = 25; permut[36] = 24;
		permut[37] = 25; permut[38] = 26; permut[39] = 27; permut[40] = 28; permut[41] = 29; permut[42] = 28; permut[43] = 29; 
		permut[44] = 30; permut[45] = 31; permut[46] = 32; permut[47] = 1;
		
		int i =0;
		while(i<48) {
			int x = permut[i];
			pAfter[i] = R[x - 1];
			i++;
		}
		return pAfter;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] XORFunction(char[] key, char[] Right) {
		try {
		char[] xorAfterCall = new char[Right.length];
		
		for (int i = 0; i < Right.length; i++) {
			if (key[i] == Right[i]) {
				xorAfterCall[i] = '0';
			} else {
				xorAfterCall[i] = '1';
			}
		}
		return xorAfterCall;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] secondPerumtation(char[] key) {
		try {
	
		int[] permutt = new int[48];
		char[] afterPer = new char[48];
		permutt[0] = 14; permutt[1] = 17; permutt[2] = 11; permutt[3] = 24; permutt[4] = 1; permutt[5] = 5; permutt[6] = 3;
		permutt[7] = 28; permutt[8] = 15; permutt[9] = 6; permutt[10] = 21; permutt[11] = 10; permutt[12] = 23; permutt[13] = 19; 
		permutt[14] = 12; permutt[15] = 4; permutt[16] = 26; permutt[17] = 8; permutt[18] = 16; permutt[19] = 7; permutt[20] = 27;
	    permutt[21] = 20; permutt[22] = 13; permutt[23] = 2; permutt[24] = 41; permutt[25] = 52; permutt[26] = 31; permutt[27] = 37;
		permutt[28] = 47; permutt[29] = 55; permutt[30] = 30; permutt[31] = 40; permutt[32] = 51; permutt[33] = 45; permutt[34] = 33;
		permutt[35] = 48; permutt[36] = 44; permutt[37] = 49; permutt[38] = 39; permutt[39] = 56; permutt[40] = 34; permutt[41] = 53;
		permutt[42] = 46; permutt[43] = 42; permutt[44] = 50; permutt[45] = 36; permutt[46] = 29; permutt[47] = 32;

		int i = 0;
		while(i<48) {
			int x = permutt[i];
			afterPer[i] = key[x - 1];	
			i++;
		}
		return afterPer;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static String makeMessageCipher(char[] key, char[] msg) {
		try {
		String[] keys = keysFunction(key);
		char[] p0 = messageFirstPermutation(msg);
		
		IO.write("ip.txt", convertToString(p0) + "\n");

		char[] L0 = messageFirstDiv(p0);
		IO.write("l.txt", convertToString(L0) + "\n");
		char[] R0 = messageSecondDiv(p0);
		IO.write("r.txt", convertToString(R0) + "\n");

		char[] f0 = f(R0, convertToChar(keys[0]));
		char[] L1 = R0;
		IO.write("l.txt", convertToString(L1) + "\n");
		char[] R1 = XORFunction(f0, L0);
		IO.write("r.txt", convertToString(R1) + "\n");
		IO.write("fxored.txt", convertToString(R1) + "\n");

		char[] f1 = f(R1, convertToChar(keys[1]));
		char[] R2 = XORFunction(f1, L1);
		IO.write("r.txt", convertToString(R2) + "\n");
		IO.write("fxored.txt", convertToString(R2) + "\n");
		char[] L2 = R1;
		IO.write("l.txt", convertToString(L2) + "\n");
		

		char[] f2 = f(R2, convertToChar(keys[2]));
		char[] L3 = R2;
		IO.write("l.txt", convertToString(L3) + "\n");
		char[] R3 = XORFunction(f2, L2);
		IO.write("fxored.txt", convertToString(R3) + "\n");
		IO.write("r.txt", convertToString(R3) + "\n");

		char[] f3 = f(R3, convertToChar(keys[3]));
		char[] R4 = XORFunction(f3, L3);
		IO.write("r.txt", convertToString(R4) + "\n");
		IO.write("fxored.txt", convertToString(R4) + "\n");
		char[] L4 = R3;
		IO.write("l.txt", convertToString(L4) + "\n");

		char[] f4 = f(R4, convertToChar(keys[4]));
		char[] L5 = R4;
		IO.write("l.txt", convertToString(L5) + "\n");
		char[] R5 = XORFunction(f4, L4);
		IO.write("r.txt", convertToString(R5) + "\n");
		IO.write("fxored.txt", convertToString(R5) + "\n");

		char[] f5 = f(R5, convertToChar(keys[5]));
		char[] R6 = XORFunction(f5, L5);
		IO.write("r.txt", convertToString(R6) + "\n");
		IO.write("fxored.txt", convertToString(R6) + "\n");
		char[] L6 = R5;
		IO.write("l.txt", convertToString(L6) + "\n");

		char[] f6 = f(R6, convertToChar(keys[6]));
		char[] L7 = R6;
		IO.write("l.txt", convertToString(L7) + "\n");
		char[] R7 = XORFunction(f6, L6);
		IO.write("r.txt", convertToString(R7) + "\n");
		IO.write("fxored.txt", convertToString(R7) + "\n");

		char[] f7 = f(R7, convertToChar(keys[7]));
		char[] R8 = XORFunction(f7, L7);
		IO.write("r.txt", convertToString(R8) + "\n");
		IO.write("fxored.txt", convertToString(R8) + "\n");
		char[] L8 = R7;
		IO.write("l.txt", convertToString(L8) + "\n");

		char[] f8 = f(R8, convertToChar(keys[8]));
		char[] L9 = R8;
		IO.write("l.txt", convertToString(L9) + "\n");
		char[] R9 = XORFunction(f8, L8);
		IO.write("r.txt", convertToString(R9) + "\n");
		IO.write("fxored.txt", convertToString(R9) + "\n");

		char[] f9 = f(R9, convertToChar(keys[9]));
		char[] R10 = XORFunction(f9, L9);
		IO.write("r.txt", convertToString(R10) + "\n");
		IO.write("fxored.txt", convertToString(R10) + "\n");
		char[] L10 = R9;
		IO.write("l.txt", convertToString(L10) + "\n");

		char[] f10 = f(R10, convertToChar(keys[10]));
		char[] L11 = R10;
		IO.write("l.txt", convertToString(L11) + "\n");
		char[] R11 = XORFunction(f10, L10);
		IO.write("r.txt", convertToString(R11) + "\n");
		IO.write("fxored.txt", convertToString(R11) + "\n");

		char[] f11 = f(R11, convertToChar(keys[11]));
		char[] R12 = XORFunction(f11, L11);
		IO.write("r.txt", convertToString(R12) + "\n");
		IO.write("fxored.txt", convertToString(R12) + "\n");
		char[] L12 = R11;
		IO.write("l.txt", convertToString(L12) + "\n");

		char[] f12 = f(R12, convertToChar(keys[12]));
		char[] L13 = R12;
		IO.write("l.txt", convertToString(L13) + "\n");
		char[] R13 = XORFunction(f12, L12);
		IO.write("r.txt", convertToString(R13) + "\n");
		IO.write("fxored.txt", convertToString(R13) + "\n");

		char[] f13 = f(R13, convertToChar(keys[13]));
		char[] R14 = XORFunction(f13, L13);
		IO.write("r.txt", convertToString(R14) + "\n");
		IO.write("fxored.txt", convertToString(R14) + "\n");
		char[] L14 = R13;
		IO.write("l.txt", convertToString(L14) + "\n");

		char[] f14 = f(R14, convertToChar(keys[14]));
		char[] L15 = R14;
		IO.write("l.txt", convertToString(L15) + "\n");
		char[] R15 = XORFunction(f14, L14);
		IO.write("r.txt", convertToString(R15) + "\n");
		IO.write("fxored.txt", convertToString(R15) + "\n");

		char[] f15 = f(R15, convertToChar(keys[15]));
		char[] R16 = R15;
		IO.write("r.txt", convertToString(R16) + "\n");

		char[] L16 = XORFunction(f15, L15);
		IO.write("l.txt", convertToString(L16) + "\n");
		IO.write("fxored.txt", convertToString(L16) + "\n");
		
		char[] lastOne = mergeBetweenLeftandRight(L16, R16);
        
		char[] ff = lastPermutation(lastOne);

		String fp = convertToString(ff);
		
		IO.write("fp.txt", fp + "\n");

		return fp;
		}catch(Exception gg) {
			return "Error";
		}
	}
	

	public static char[] divForLeftSide(char[] key) {
		try {
		char[] left = new char[key.length / 2];
		
		for (int i = 0; i < (key.length / 2); i++) {
			left[i] = key[i];
		}
		return left;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] divForRightSide(char[] key) {
		try {
		char[] right = new char[key.length / 2];
		int p = 0;
		for (int i = key.length / 2; i < key.length; i++) {
			right[p++] = key[i];
		}
		return right;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] messageFirstDiv(char[] arrMessage) {
		try {
		char[] left = new char[arrMessage.length / 2];
		for (int i = 0; i < arrMessage.length / 2; i++) {
			left[i] = arrMessage[i];
		}
		return left;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] messageSecondDiv(char[] arrOfMessage) {
		try {
		char[] right = new char[arrOfMessage.length / 2];
		int n = 0;
		for (int i = arrOfMessage.length / 2; i < arrOfMessage.length; i++) {
			right[n++] = arrOfMessage[i];
		}
		return right;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] mergeBetweenLeftandRight(char[] left, char[] right) {
		try {
		char[] x = new char[left.length + right.length];
		int p = 0;
		for (int i = 0; i < left.length; i++)
			x[p++] = left[i];
		for (int i = 0; i < right.length; i++)
			x[p++] = right[i];
		return x;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static String convertToString(char[] charToString) {
		try {
		String key = "";
		for (int i = 0; i < charToString.length; i++) {
			key += charToString[i];
		}
		return key;
		}catch(Exception gg) {
			return "";
		}
	}
	public static char[] convertToChar(String key) {
		try {
		char[] keys = new char[key.length()];
		int Nkeys = 0;
		for (int i = 0; i < keys.length; i++) {
			char x = key.charAt(i);
			if (x != ' ') {
				keys[Nkeys++] = x;
			}

		}
		return keys;
		}catch(Exception gg) {
			return new char[1];
		}
	}
	public static char[] DBox(char[] merged) {
		try {
		int[] D = new int[32];
		D[0] = 16; D[1] = 7; D[2] = 20; D[3] = 21; D[4] = 29; D[5] = 12; D[6] = 28; D[7] = 17; D[8] = 1; D[9] = 15;
		D[10] = 23; D[11] = 26; D[12] = 5; D[13] = 18; D[14] = 31; D[15] = 10; D[16] = 2; D[17] = 8; D[18] = 24; D[19] = 14;
		D[20] = 32; D[21] = 27; D[22] = 3; D[23] = 9; D[24] = 19; D[25] = 13; D[26] = 30; D[27] = 6; D[28] = 22; D[29] = 11;
		D[30] = 4; D[31] = 25;

		char[] e = new char[32];
		for (int i = 0; i < 32; i++) {
			int x = D[i];
			e[i] = merged[x - 1];
		}
		return e;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static String[] keysFunction(char[] key) {
		try {
		char[] pc1 = firstPermutation(key);
		IO.write("kp1.txt", convertToString(pc1) + "\n");
		char[] L1 = divForLeftSide(pc1);
		char[] R1 = divForRightSide(pc1);
		String[] keys = new String[16];

		char[] L2 = shiftToLeft(1, L1);
		char[] R2 = shiftToLeft(1, R1);
		IO.write("c.txt", convertToString(L2) + "\n");
		IO.write("d.txt", convertToString(R2) + "\n");
		char[] pc2 = secondPerumtation(mergeBetweenLeftandRight(L2, R2));
		keys[0] = convertToString(pc2);
		IO.write("keys.txt", keys[0] + "\n");
		
		char[] L3 = shiftToLeft(1, L2);
		char[] R3 = shiftToLeft(1, R2);
		IO.write("c.txt", convertToString(L3) + "\n");
		IO.write("d.txt", convertToString(R3) + "\n");
		char[] pc3 = secondPerumtation(mergeBetweenLeftandRight(L3, R3));
		keys[1] = convertToString(pc3);
		IO.write("keys.txt", keys[1] + "\n");
		
		char[] L4 = shiftToLeft(2, L3);
		char[] R4 = shiftToLeft(2, R3);
		IO.write("c.txt", convertToString(L4) + "\n");
		IO.write("d.txt", convertToString(R4) + "\n");
		char[] pc4 = secondPerumtation(mergeBetweenLeftandRight(L4, R4));
		keys[2] = convertToString(pc4);
		IO.write("keys.txt", keys[2] + "\n");
		
		char[] L5 = shiftToLeft(2, L4);
		char[] R5 = shiftToLeft(2, R4);
		IO.write("c.txt", convertToString(L5) + "\n");
		IO.write("d.txt", convertToString(R5) + "\n");
		char[] pc5 = secondPerumtation(mergeBetweenLeftandRight(L5, R5));
		keys[3] = convertToString(pc5);
		IO.write("keys.txt", keys[3] + "\n");
		
		char[] L6 = shiftToLeft(2, L5);
		char[] R6 = shiftToLeft(2, R5);
		IO.write("c.txt", convertToString(L6) + "\n");
		IO.write("d.txt", convertToString(R6) + "\n");
		char[] pc6 = secondPerumtation(mergeBetweenLeftandRight(L6, R6));
		keys[4] = convertToString(pc6);
		IO.write("keys.txt", keys[4] + "\n");
		
		char[] L7 = shiftToLeft(2, L6);
		char[] R7 = shiftToLeft(2, R6);
		IO.write("c.txt", convertToString(L7) + "\n");
		IO.write("d.txt", convertToString(R7) + "\n");
		char[] pc7 = secondPerumtation(mergeBetweenLeftandRight(L7, R7));
		keys[5] = convertToString(pc7);
		IO.write("keys.txt", keys[5] + "\n");
		
		char[] L8 = shiftToLeft(2, L7);
		char[] R8 = shiftToLeft(2, R7);
		IO.write("c.txt", convertToString(L8) + "\n");
		IO.write("d.txt", convertToString(R8) + "\n");
		char[] pc8 = secondPerumtation(mergeBetweenLeftandRight(L8, R8));
		keys[6] = convertToString(pc8);
		IO.write("keys.txt", keys[6] + "\n");
		
		char[] L9 = shiftToLeft(2, L8);
		char[] R9 = shiftToLeft(2, R8);
		IO.write("c.txt", convertToString(L9) + "\n");
		IO.write("d.txt", convertToString(R9) + "\n");
		char[] pc9 = secondPerumtation(mergeBetweenLeftandRight(L9, R9));
		keys[7] = convertToString(pc9);
		IO.write("keys.txt", keys[7] + "\n");
		
		char[] L10 = shiftToLeft(1, L9);
		char[] R10 = shiftToLeft(1, R9);
		IO.write("c.txt", convertToString(L10) + "\n");
		IO.write("d.txt", convertToString(R10) + "\n");
		char[] pc10 = secondPerumtation(mergeBetweenLeftandRight(L10, R10));
		keys[8] = convertToString(pc10);
		IO.write("keys.txt", keys[8] + "\n");
		
		char[] L11 = shiftToLeft(2, L10);
		char[] R11 = shiftToLeft(2, R10);
		IO.write("c.txt", convertToString(L11) + "\n");
		IO.write("d.txt", convertToString(R11) + "\n");
		char[] pc11 = secondPerumtation(mergeBetweenLeftandRight(L11, R11));
		keys[9] = convertToString(pc11);
		IO.write("keys.txt", keys[9] + "\n");
		
		char[] L12 = shiftToLeft(2, L11);
		char[] R12 = shiftToLeft(2, R11);
		IO.write("c.txt", convertToString(L12) + "\n");
		IO.write("d.txt", convertToString(R12) + "\n");
		char[] pc12 = secondPerumtation(mergeBetweenLeftandRight(L12, R12));
		keys[10] = convertToString(pc12);
		IO.write("keys.txt", keys[10] + "\n");
		
		char[] L13 = shiftToLeft(2, L12);
		char[] R13 = shiftToLeft(2, R12);
		IO.write("c.txt", convertToString(L13) + "\n");
		IO.write("d.txt", convertToString(R13) + "\n");
		char[] pc13 = secondPerumtation(mergeBetweenLeftandRight(L13, R13));
		keys[11] = convertToString(pc13);
		IO.write("keys.txt", keys[11] + "\n");
		
		char[] L14 = shiftToLeft(2, L13);
		char[] R14 = shiftToLeft(2, R13);
		IO.write("c.txt", convertToString(L14) + "\n");
		IO.write("d.txt", convertToString(R14) + "\n");
		char[] pc14 = secondPerumtation(mergeBetweenLeftandRight(L14, R14));
		keys[12] = convertToString(pc14);
		IO.write("keys.txt", keys[12] + "\n");
		
		char[] L15 = shiftToLeft(2, L14);
		char[] R15 = shiftToLeft(2, R14);
		IO.write("c.txt", convertToString(L15) + "\n");
		IO.write("d.txt", convertToString(R15) + "\n");
		char[] pc15 = secondPerumtation(mergeBetweenLeftandRight(L15, R15));
		keys[13] = convertToString(pc15);
		IO.write("keys.txt", keys[13] + "\n");
		
		char[] L16 = shiftToLeft(2, L15);
		char[] R16 = shiftToLeft(2, R15);
		IO.write("c.txt", convertToString(L16) + "\n");
		IO.write("d.txt", convertToString(R16) + "\n");
		char[] pc16 = secondPerumtation(mergeBetweenLeftandRight(L16, R16));
		keys[14] = convertToString(pc16);
		IO.write("keys.txt", keys[14] + "\n");
		
		char[] L17 = shiftToLeft(1, L16);
		char[] R17 = shiftToLeft(1, R16);
		IO.write("c.txt", convertToString(L17) + "\n");
		IO.write("d.txt", convertToString(R17) + "\n");
		char[] pc17 = secondPerumtation(mergeBetweenLeftandRight(L17, R17));
		keys[15] = convertToString(pc17);
		IO.write("keys.txt", keys[15] + "\n");
		
		return keys;
		}catch(Exception gg) {
			return new String[1];
		}
	}

	public static char[] SBoxN1(char[] right) {
		try {
		int[][] sbox1 = new int[4][16];
        sbox1[0][0] = 14; sbox1[0][1] = 4; sbox1[0][2] = 13; sbox1[0][3] = 1; sbox1[0][4] = 2; sbox1[0][5] = 15; sbox1[0][6] = 11; sbox1[0][7] = 8;
		sbox1[0][8] = 3; sbox1[0][9] = 10; sbox1[0][10] = 6; sbox1[0][11] = 12; sbox1[0][12] = 5; sbox1[0][13] = 9; sbox1[0][14] = 0;
		sbox1[0][15] = 7; sbox1[1][0] = 0; sbox1[1][1] = 15; sbox1[1][2] = 7; sbox1[1][3] = 4; sbox1[1][4] = 14; sbox1[1][5] = 2;
		sbox1[1][6] = 13; sbox1[1][7] = 1; sbox1[1][8] = 10; sbox1[1][9] = 6; sbox1[1][10] = 12; sbox1[1][11] = 11; sbox1[1][12] = 9; 
		sbox1[1][13] = 5; sbox1[1][14] = 3; sbox1[1][15] = 8; sbox1[2][0] = 4; sbox1[2][1] = 1; sbox1[2][2] = 14; sbox1[2][3] = 8;
		sbox1[2][4] = 13; sbox1[2][5] = 6; sbox1[2][6] = 2; sbox1[2][7] = 11; sbox1[2][8] = 15; sbox1[2][9] = 12; sbox1[2][10] = 9;
		sbox1[2][11] = 7; sbox1[2][12] = 3; sbox1[2][13] = 10; sbox1[2][14] = 5; sbox1[2][15] = 0; sbox1[3][0] = 15; sbox1[3][1] = 12;
		sbox1[3][2] = 8; sbox1[3][3] = 2; sbox1[3][4] = 4; sbox1[3][5] = 9; sbox1[3][6] = 1; sbox1[3][7] = 7; sbox1[3][8] = 5;
		sbox1[3][9] = 11; sbox1[3][10] = 3; sbox1[3][11] = 14; sbox1[3][12] = 10; sbox1[3][13] = 0; sbox1[3][14] = 6; sbox1[3][15] = 13;
		int[] s1 = new int[6];

		int count = 0;
		for (int i = 0; i < 6; i++) {
			if (right[count] == '0') {
				s1[i] = 0;
			} else {
				s1[i] = 1;
			}
			count++;
		}
		int vertic = (s1[0] * 2) + s1[5];
		int colmn = (s1[1] * 8) + (s1[2] * 4) + (s1[3] * 2) + (s1[4]);
		double total = sbox1[vertic][colmn];

		char[] element = new char[4];

		for (int i = 3; i >= 0; i--) {
			if (total % 2 > 0) {
				element[i] = '1';
			} else {
				element[i] = '0';
			}
			int h = (int) (total /= 2);
			total = h;

		}
		return element;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] SBoxN2(char[] right) {
		try {
		int[][] sbox2 = new int[4][16];
		sbox2[0][0] = 15; sbox2[0][1] = 1; sbox2[0][2] = 8; sbox2[0][3] = 14; sbox2[0][4] = 6; sbox2[0][5] = 11; sbox2[0][6] = 3;
		sbox2[0][7] = 4; sbox2[0][8] = 9; sbox2[0][9] = 7; sbox2[0][10] = 2; sbox2[0][11] = 13; sbox2[0][12] = 12; sbox2[0][13] = 0;
		sbox2[0][14] = 5; sbox2[0][15] = 10; sbox2[1][0] = 3; sbox2[1][1] = 13; sbox2[1][2] = 4; sbox2[1][3] = 7; sbox2[1][4] = 15;
		sbox2[1][5] = 2; sbox2[1][6] = 8; sbox2[1][7] = 14; sbox2[1][8] = 12; sbox2[1][9] = 0; sbox2[1][10] = 1; sbox2[1][11] = 10;
		sbox2[1][12] = 6; sbox2[1][13] = 9; sbox2[1][14] = 11; sbox2[1][15] = 5; sbox2[2][0] = 0; sbox2[2][1] = 14; sbox2[2][2] = 7;
		sbox2[2][3] = 11; sbox2[2][4] = 10; sbox2[2][5] = 4; sbox2[2][6] = 13; sbox2[2][7] = 1; sbox2[2][8] = 5; sbox2[2][9] = 8;
		sbox2[2][10] = 12; sbox2[2][11] = 6; sbox2[2][12] = 9; sbox2[2][13] = 3; sbox2[2][14] = 2; sbox2[2][15] = 15; sbox2[3][0] = 13;
		sbox2[3][1] = 8; sbox2[3][2] = 10; sbox2[3][3] = 1; sbox2[3][4] = 3; sbox2[3][5] = 15; sbox2[3][6] = 4; sbox2[3][7] = 2; sbox2[3][8] = 11;
		sbox2[3][9] = 6; sbox2[3][10] = 7; sbox2[3][11] = 12; sbox2[3][12] = 0; sbox2[3][13] = 5; sbox2[3][14] = 14; sbox2[3][15] = 9;
		int[] s2 = new int[6];

		int count = 6;
		for (int i = 0; i < 6; i++) {

			if (right[count] == '0') {
				s2[i] = 0;
			} else {
				s2[i] = 1;
			}
			count++;
		}
		int r = (s2[0] * 2) + s2[5];
		int c = (s2[1] * 8) + (s2[2] * 4) + (s2[3] * 2) + (s2[4]);
		double total = sbox2[r][c];

		char[] e = new char[4];

		for (int i = 3; i >= 0; i--) {
			if (total % 2 > 0) {
				e[i] = '1';
			} else {
				e[i] = '0';
			}
			int h = (int) (total /= 2);
			total = h;

		}
		return e;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] SBoxN3(char[] right) {
		try {
		int[][] boxOfS3 = new int[4][16];
		boxOfS3[0][0] = 10; boxOfS3[0][1] = 0; boxOfS3[0][2] = 9; boxOfS3[0][3] = 14; boxOfS3[0][4] = 6; boxOfS3[0][5] = 3;
		boxOfS3[0][6] = 15; boxOfS3[0][7] = 5; boxOfS3[0][8] = 1; boxOfS3[0][9] = 13; boxOfS3[0][10] = 12; boxOfS3[0][11] = 7; boxOfS3[0][12] = 11;
		boxOfS3[0][13] = 4; boxOfS3[0][14] = 2; boxOfS3[0][15] = 8; boxOfS3[1][0] = 13; boxOfS3[1][1] = 7; boxOfS3[1][2] = 0;
		boxOfS3[1][3] = 9; boxOfS3[1][4] = 3; boxOfS3[1][5] = 4; boxOfS3[1][6] = 6; boxOfS3[1][7] = 10; boxOfS3[1][8] = 2; boxOfS3[1][9] = 8;
		boxOfS3[1][10] = 5; boxOfS3[1][11] = 14; boxOfS3[1][12] = 12; boxOfS3[1][13] = 11; boxOfS3[1][14] = 15; boxOfS3[1][15] = 1;
		boxOfS3[2][0] = 13; boxOfS3[2][1] = 6; boxOfS3[2][2] = 4; boxOfS3[2][3] = 9; boxOfS3[2][4] = 8; boxOfS3[2][5] = 15; boxOfS3[2][6] = 3;
		boxOfS3[2][7] = 0; boxOfS3[2][8] = 11; boxOfS3[2][9] = 1; boxOfS3[2][10] = 2; boxOfS3[2][11] = 12; boxOfS3[2][12] = 15;
		boxOfS3[2][13] = 10; boxOfS3[2][14] = 14; boxOfS3[2][15] = 7; boxOfS3[3][0] = 1; boxOfS3[3][1] = 10; boxOfS3[3][2] = 13;
		boxOfS3[3][3] = 0; boxOfS3[3][4] = 6; boxOfS3[3][5] = 9; boxOfS3[3][6] = 8; boxOfS3[3][7] = 7; boxOfS3[3][8] = 4;
		boxOfS3[3][9] = 15; boxOfS3[3][10] = 14; boxOfS3[3][11] = 3; boxOfS3[3][12] = 11; boxOfS3[3][13] = 5; boxOfS3[3][14] = 2; boxOfS3[3][15] = 12;
		int[] s3 = new int[6];

		int count = 12;
		for (int i = 0; i < 6; i++) {

			if (right[count] == '0') {
				s3[i] = 0;
			} else {
				s3[i] = 1;
			}
			count++;
		}
		int vertic = (s3[0] * 2) + s3[5];
		int colum = (s3[1] * 8) + (s3[2] * 4) + (s3[3] * 2) + (s3[4]);
		double total = boxOfS3[vertic][colum];

		char[] e = new char[4];

		for (int i = 3; i >= 0; i--) {
			if (total % 2 > 0) {
				e[i] = '1';
			} else {
				e[i] = '0';
			}
			int h = (int) (total /= 2);
			total = h;

		}
		return e;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] SBoxN4(char[] R) {
		try {
		int[][] sbox4 = new int[4][16];
		sbox4[0][0] = 7; sbox4[0][1] = 13; sbox4[0][2] = 14; sbox4[0][3] = 3; sbox4[0][4] = 0; sbox4[0][5] = 6; sbox4[0][6] = 9;
		sbox4[0][7] = 10; sbox4[0][8] = 1; sbox4[0][9] = 2; sbox4[0][10] = 8; sbox4[0][11] = 5; sbox4[0][12] = 11; sbox4[0][13] = 12;
		sbox4[0][14] = 4; sbox4[0][15] = 15; sbox4[1][0] = 13; sbox4[1][1] = 8; sbox4[1][2] = 11; sbox4[1][3] = 5; sbox4[1][4] = 6;
		sbox4[1][5] = 15; sbox4[1][6] = 0; sbox4[1][7] = 3; sbox4[1][8] = 4; sbox4[1][9] = 7; sbox4[1][10] = 2; sbox4[1][11] = 12;
		sbox4[1][12] = 1; sbox4[1][13] = 10; sbox4[1][14] = 14; sbox4[1][15] = 9; sbox4[2][0] = 10; sbox4[2][1] = 6; sbox4[2][2] = 9;
		sbox4[2][3] = 0; sbox4[2][4] = 12; sbox4[2][5] = 11; sbox4[2][6] = 7; sbox4[2][7] = 13; sbox4[2][8] = 15; sbox4[2][9] = 1;
		sbox4[2][10] = 3; sbox4[2][11] = 14; sbox4[2][12] = 5; sbox4[2][13] = 2; sbox4[2][14] = 8; sbox4[2][15] = 4; sbox4[3][0] = 3;
		sbox4[3][1] = 15; sbox4[3][2] = 0; sbox4[3][3] = 6;sbox4[3][4] = 10; sbox4[3][5] = 1; sbox4[3][6] = 13; sbox4[3][7] = 8; sbox4[3][8] = 9;
		sbox4[3][9] = 4; sbox4[3][10] = 5; sbox4[3][11] = 11; sbox4[3][12] = 12; sbox4[3][13] = 7; sbox4[3][14] = 2; sbox4[3][15] = 14;
		int[] s4 = new int[6];

		int count = 18;
		for (int i = 0; i < 6; i++) {

			if (R[count] == '0') {
				s4[i] = 0;
			} else {
				s4[i] = 1;
			}
			count++;
		}
		int r = (s4[0] * 2) + s4[5];
		int c = (s4[1] * 8) + (s4[2] * 4) + (s4[3] * 2) + (s4[4]);
		double total = sbox4[r][c];

		char[] element = new char[4];

		for (int i = 3; i >= 0; i--) {
			if (total % 2 > 0) {
				element[i] = '1';
			} else {
				element[i] = '0';
			}
			int h = (int) (total /= 2);
			total = h;

		}
		return element;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] SBoxN5(char[] R) {
		try {
		int[][] sbox5 = new int[4][16];
		sbox5[0][0] = 2; sbox5[0][1] = 12; sbox5[0][2] = 4; sbox5[0][3] = 1; sbox5[0][4] = 7; sbox5[0][5] = 10;
		sbox5[0][6] = 11; sbox5[0][7] = 6; sbox5[0][8] = 8; sbox5[0][9] = 5; sbox5[0][10] = 3; sbox5[0][11] = 15; sbox5[0][12] = 13;
		sbox5[0][13] = 0; sbox5[0][14] = 14; sbox5[0][15] = 9; sbox5[1][0] = 14; sbox5[1][1] = 11; sbox5[1][2] = 2; sbox5[1][3] = 12;
		sbox5[1][4] = 4; sbox5[1][5] = 7; sbox5[1][6] = 13; sbox5[1][7] = 1; sbox5[1][8] = 5; sbox5[1][9] = 0; sbox5[1][10] = 15;
		sbox5[1][11] = 10; sbox5[1][12] = 3; sbox5[1][13] = 9; sbox5[1][14] = 8; sbox5[1][15] = 6; sbox5[2][0] = 4; sbox5[2][1] = 2; sbox5[2][2] = 1;
		sbox5[2][3] = 11; sbox5[2][4] = 10; sbox5[2][5] = 13; sbox5[2][6] = 7; sbox5[2][7] = 8; sbox5[2][8] = 15; sbox5[2][9] = 9;
		sbox5[2][10] = 12; sbox5[2][11] = 5; sbox5[2][12] = 6; sbox5[2][13] = 3; sbox5[2][14] = 0; sbox5[2][15] = 14; sbox5[3][0] = 11;
		sbox5[3][1] = 8; sbox5[3][2] = 12; sbox5[3][3] = 7; sbox5[3][4] = 1; sbox5[3][5] = 14; sbox5[3][6] = 2; sbox5[3][7] = 13;
		sbox5[3][8] = 6; sbox5[3][9] = 15; sbox5[3][10] = 0; sbox5[3][11] = 9; sbox5[3][12] = 10; sbox5[3][13] = 4; sbox5[3][14] = 5; sbox5[3][15] = 3;
		int[] s5 = new int[6];

		int count = 24;
		for (int i = 0; i < 6; i++) {
			if (R[count] == '0') {
				s5[i] = 0;
			} else {
				s5[i] = 1;
			}
			count++;
		}
		int vertic = (s5[0] * 2) + s5[5];
		int colum = (s5[1] * 8) + (s5[2] * 4) + (s5[3] * 2) + (s5[4]);
		double total = sbox5[vertic][colum];
		char[] e = new char[4];
		for (int i = 3; i >= 0; i--) {
			if (total % 2 > 0) {
				e[i] = '1';
			} else {
				e[i] = '0';
			}
			int h = (int) (total /= 2);
			total = h;

		}
		return e;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] SBoxN6(char[] R) {
		try {
		int[][] sbox6 = new int[4][16];
		sbox6[0][0] = 12; sbox6[0][1] = 1; sbox6[0][2] = 10; sbox6[0][3] = 15; sbox6[0][4] = 9; sbox6[0][5] = 2; sbox6[0][6] = 6;
		sbox6[0][7] = 8; sbox6[0][8] = 0; sbox6[0][9] = 13; sbox6[0][10] = 3; sbox6[0][11] = 4; sbox6[0][12] = 14; sbox6[0][13] = 7;
		sbox6[0][14] = 5; sbox6[0][15] = 11; sbox6[1][0] = 10; sbox6[1][1] = 15; sbox6[1][2] = 4; sbox6[1][3] = 2; sbox6[1][4] = 7;
		sbox6[1][5] = 12; sbox6[1][6] = 9; sbox6[1][7] = 5; sbox6[1][8] = 6; sbox6[1][9] = 1; sbox6[1][10] = 13; sbox6[1][11] = 14;
		sbox6[1][12] = 0; sbox6[1][13] = 11; sbox6[1][14] = 3; sbox6[1][15] = 8; sbox6[2][0] = 9; sbox6[2][1] = 14; sbox6[2][2] = 15;
		sbox6[2][3] = 5; sbox6[2][4] = 2; sbox6[2][5] = 8; sbox6[2][6] = 12; sbox6[2][7] = 3; sbox6[2][8] = 7; sbox6[2][9] = 0;
		sbox6[2][10] = 4; sbox6[2][11] = 10; sbox6[2][12] = 1; sbox6[2][13] = 13; sbox6[2][14] = 11; sbox6[2][15] = 6; sbox6[3][0] = 4;
		sbox6[3][1] = 3; sbox6[3][2] = 2; sbox6[3][3] = 12; sbox6[3][4] = 9; sbox6[3][5] = 5; sbox6[3][6] = 15; sbox6[3][7] = 10;
		sbox6[3][8] = 11; sbox6[3][9] = 14; sbox6[3][10] = 1; sbox6[3][11] = 7; sbox6[3][12] = 6; sbox6[3][13] = 0; sbox6[3][14] = 8; sbox6[3][15] = 13;
		int[] s6 = new int[6];

		int count = 30;
		for (int i = 0; i < 6; i++) {

			if (R[count] == '0') {
				s6[i] = 0;
			} else {
				s6[i] = 1;
			}
			count++;
		}
		int r = (s6[0] * 2) + s6[5];
		int c = (s6[1] * 8) + (s6[2] * 4) + (s6[3] * 2) + (s6[4]);
		double total = sbox6[r][c];

		char[] e = new char[4];

		for (int i = 3; i >= 0; i--) {
			if (total % 2 > 0) {
				e[i] = '1';
			} else {
				e[i] = '0';
			}
			int h = (int) (total /= 2);
			total = h;

		}
		return e;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] SBoxN7(char[] R) {
		try {
		int[][] sbox7 = new int[4][16];
		sbox7[0][0] = 4; sbox7[0][1] = 11; sbox7[0][2] = 2; sbox7[0][3] = 14; sbox7[0][4] = 15; sbox7[0][5] = 0; sbox7[0][6] = 8;
		sbox7[0][7] = 13; sbox7[0][8] = 3; sbox7[0][9] = 12; sbox7[0][10] = 9; sbox7[0][11] = 7; sbox7[0][12] = 5; sbox7[0][13] = 10;
		sbox7[0][14] = 6; sbox7[0][15] = 1; sbox7[1][0] = 13; sbox7[1][1] = 0; sbox7[1][2] = 11; sbox7[1][3] = 7; sbox7[1][4] = 4;
		sbox7[1][5] = 9; sbox7[1][6] = 1; sbox7[1][7] = 10; sbox7[1][8] = 14; sbox7[1][9] = 3; sbox7[1][10] = 5; sbox7[1][11] = 12;
		sbox7[1][12] = 2; sbox7[1][13] = 15; sbox7[1][14] = 8; sbox7[1][15] = 6; sbox7[2][0] = 1; sbox7[2][1] = 4; sbox7[2][2] = 11;
		sbox7[2][3] = 13; sbox7[2][4] = 12; sbox7[2][5] = 3; sbox7[2][6] = 7; sbox7[2][7] = 14; sbox7[2][8] = 10; sbox7[2][9] = 15;
		sbox7[2][10] = 6; sbox7[2][11] = 8; sbox7[2][12] = 0; sbox7[2][13] = 5; sbox7[2][14] = 9; sbox7[2][15] = 2; sbox7[3][0] = 6; sbox7[3][1] = 11;
		sbox7[3][2] = 13; sbox7[3][3] = 8; sbox7[3][4] = 1; sbox7[3][5] = 4; sbox7[3][6] = 10; sbox7[3][7] = 7; sbox7[3][8] = 9;
		sbox7[3][9] = 5; sbox7[3][10] = 0; sbox7[3][11] = 15; sbox7[3][12] = 14; sbox7[3][13] = 2; sbox7[3][14] = 3; sbox7[3][15] = 12;
		int[] s7 = new int[6];

		int count = 36;
		for (int i = 0; i < 6; i++) {

			if (R[count] == '0') {
				s7[i] = 0;
			} else {
				s7[i] = 1;
			}
			count++;
		}
		int r = (s7[0] * 2) + s7[5];
		int c = (s7[1] * 8) + (s7[2] * 4) + (s7[3] * 2) + (s7[4]);
		double total = sbox7[r][c];

		char[] e = new char[4];

		for (int i = 3; i >= 0; i--) {
			if (total % 2 > 0) {
				e[i] = '1';
			} else {
				e[i] = '0';
			}
			int h = (int) (total /= 2);
			total = h;

		}
		return e;
		}catch(Exception gg) {
			return new char[1];
		}
	}

	public static char[] SBoxN8(char[] R) {
		try {
		int[][] sbox8 = new int[4][16];
		sbox8[0][0] = 13; sbox8[0][1] = 2; sbox8[0][2] = 8; sbox8[0][3] = 4; sbox8[0][4] = 6; sbox8[0][5] = 15; sbox8[0][6] = 11;
		sbox8[0][7] = 1; sbox8[0][8] = 10; sbox8[0][9] = 9; sbox8[0][10] = 3; sbox8[0][11] = 14; sbox8[0][12] = 5; sbox8[0][13] = 0;
		sbox8[0][14] = 12; sbox8[0][15] = 7; sbox8[1][0] = 1; sbox8[1][1] = 15; sbox8[1][2] = 13; sbox8[1][3] = 8; sbox8[1][4] = 10;
		sbox8[1][5] = 3; sbox8[1][6] = 7; sbox8[1][7] = 4; sbox8[1][8] = 12; sbox8[1][9] = 5; sbox8[1][10] = 6; sbox8[1][11] = 11;
		sbox8[1][12] = 0; sbox8[1][13] = 14; sbox8[1][14] = 9; sbox8[1][15] = 2; sbox8[2][0] = 7; sbox8[2][1] = 11; sbox8[2][2] = 4; sbox8[2][3] = 1;
		sbox8[2][4] = 9; sbox8[2][5] = 12; sbox8[2][6] = 14; sbox8[2][7] = 2; sbox8[2][8] = 0; sbox8[2][9] = 6; sbox8[2][10] = 10;
		sbox8[2][11] = 13; sbox8[2][12] = 15; sbox8[2][13] = 3; sbox8[2][14] = 5; sbox8[2][15] = 8; sbox8[3][0] = 2; sbox8[3][1] = 1;
		sbox8[3][2] = 14; sbox8[3][3] = 7; sbox8[3][4] = 4; sbox8[3][5] = 10; sbox8[3][6] = 8; sbox8[3][7] = 13; sbox8[3][8] = 15; sbox8[3][9] = 12;
		sbox8[3][10] = 9; sbox8[3][11] = 0; sbox8[3][12] = 3; sbox8[3][13] = 5; sbox8[3][14] = 6; sbox8[3][15] = 11;
		int[] s8 = new int[6];

		int count = 42;
		for (int i = 0; i < 6; i++) {

			if (R[count] == '0') {
				s8[i] = 0;
			} else {
				s8[i] = 1;
			}
			count++;
		}
		int r = (s8[0] * 2) + s8[5];
		int c = (s8[1] * 8) + (s8[2] * 4) + (s8[3] * 2) + (s8[4]);
		double total = sbox8[r][c];

		char[] e = new char[4];

		for (int i = 3; i >= 0; i--) {
			if (total % 2 > 0) {
				e[i] = '1';
			} else {
				e[i] = '0';
			}
			int h = (int) (total /= 2);
			total = h;

		}
		return e;
		}catch(Exception gg) {
			return new char[1];
		}
	}
	public static char[] mergeBetweenSBoxes(char[] R, char[] key) {
		try {
		char[] merge = new char[32];
		int number = 0;
		R = ExpantionTheMessage(R);
		String s = convertToString(R);
		IO.write("ep.txt", s + "\n");
		char[] x = XORFunction(key, R);
		String z = convertToString(x);
		IO.write("xored.txt", z + "\n");
		char[] s1 = SBoxN1(x);
		IO.write("s0.txt", convertToString(s1) + "\n");
		char[] s2 = SBoxN2(x);
		IO.write("s1.txt", convertToString(s2) + "\n");
		char[] s3 = SBoxN3(x);
		IO.write("s2.txt", convertToString(s3) + "\n");
		char[] s4 = SBoxN4(x);
		IO.write("s3.txt", convertToString(s4) + "\n");
		char[] s5 = SBoxN5(x);
		IO.write("s4.txt", convertToString(s5) + "\n");
		char[] s6 = SBoxN6(x);
		IO.write("s5.txt", convertToString(s6) + "\n");
		char[] s7 = SBoxN7(x);
		IO.write("s6.txt", convertToString(s7) + "\n");
		char[] s8 = SBoxN8(x);
		IO.write("s7.txt", convertToString(s8) + "\n");
		for (int i = 0; i < 4; i++) {
			merge[number++] = s1[i];
		}
		for (int i = 0; i < 4; i++) {
			merge[number++] = s2[i];
		}
		for (int i = 0; i < 4; i++) {
			merge[number++] = s3[i];
		}
		for (int i = 0; i < 4; i++) {
			merge[number++] = s4[i];
		}
		for (int i = 0; i < 4; i++) {
			merge[number++] = s5[i];
		}
		for (int i = 0; i < 4; i++) {
			merge[number++] = s6[i];
		}
		for (int i = 0; i < 4; i++) {
			merge[number++] = s7[i];
		}
		for (int i = 0; i < 4; i++) {
			merge[number++] = s8[i];
		}
		return merge;
		}catch(Exception gg) {
			return new char[1];
		}
	}
	public static char[] f(char[] R, char[] key) {
		try {
		char[] merged = mergeBetweenSBoxes(R, key);
		char[] end = DBox(merged);
		IO.write("f.txt", convertToString(end) + "\n");
		return end;
		}catch(Exception gg) {
			return new char[1];
		}
	}

}
