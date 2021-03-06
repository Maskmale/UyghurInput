package classs;

public class kuozhan {
	public enum Begtype {
		WDBEG, INBEG, NOBEG
	}

	Ligatures[] pform = new Ligatures[256];
	public static char BPAD = '\u0600'; // Basic region
	public static char BMAX = '\u06FF';
	char[] cmap = new char[256];
	char[] cmapinv = new char[256];
	public static char CHEE = '\u0686';
	public static char GHEE = '\u063A';
	public static char NGEE = '\u06AD';
	public static char SHEE = '\u0634';
	public static char SZEE = '\u0698';
	public static char LA = '\uFEFB';
	public static char _LA = '\uFEFC';
	public static char HAMZA = '\u0626';

	private int[] UyCodes = new int[] { 0x622, 0xfe81, 0xfe82, 0xfe81, 0xfe82,
			0x623, 0xfe83, 0xfe84, 0xfe83, 0xfe84, 0x624, 0xfe85, 0xfe86,
			0xfe85, 0xfe86, 0x625, 0xfe87, 0xfe88, 0xfe87, 0xfe88, 0x626,
			0xfb89, 0xfe8a, 0xfe8b, 0xfe8c, 0x627, 0xfe8d, 0xfe8e, 0xfe8d,
			0xfe8e, 0x628, 0xfe8f, 0xfe90, 0xfe91, 0xfe92, 0x629, 0xfe93,
			0xfe94, 0xfe93, 0xfe94, 0x62a, 0xfe95, 0xfe96, 0xfe97, 0xfe98,
			0x62b, 0xfe99, 0xfe9a, 0xfe9b, 0xfe9c, 0x62c, 0xfe9d, 0xfe9e,
			0xfe9f, 0xfea0, 0x62d, 0xfea1, 0xfea2, 0xfea3, 0xfea4, 0x62e,
			0xfea5, 0xfea6, 0xfea7, 0xfea8, 0x62f, 0xfea9, 0xfeaa, 0xfea9,
			0xfeaa, 0x630, 0xfeab, 0xfeac, 0xfeab, 0xfeac, 0x631, 0xfead,
			0xfeae, 0xfead, 0xfeae, 0x632, 0xfeaf, 0xfeb0, 0xfeaf, 0xfeb0,
			0x633, 0xfeb1, 0xfeb2, 0xfeb3, 0xfeb4, 0x634, 0xfeb5, 0xfeb6,
			0xfeb7, 0xfeb8, 0x635, 0xfeb9, 0xfeba, 0xfebb, 0xfebc, 0x636,
			0xfebd, 0xfebe, 0xfebf, 0xfec0, 0x638, 0xfec5, 0xfec6, 0xfec7,
			0xfec8, 0x639, 0xfec9, 0xfeca, 0xfecb, 0xfecc, 0x63a, 0xfecd,
			0xfece, 0xfecf, 0xfed0, 0x641, 0xfed1, 0xfed2, 0xfed3, 0xfed4,
			0x642, 0xfed5, 0xfed6, 0xfed7, 0xfed8, 0x643, 0xfed9, 0xfeda,
			0xfedb, 0xfedc, 0x644, 0xfedd, 0xfede, 0xfedf, 0xfee0, 0x645,
			0xfee1, 0xfee2, 0xfee3, 0xfee4, 0x646, 0xfee5, 0xfee6, 0xfee7,
			0xfee8, 0x647, 0xfeeb, 0xfeec, 0xfeeb, 0xfeec, 0x648, 0xfeed,
			0xfeee, 0xfeed, 0xfeee, 0x649, 0xfeef, 0xfef0, 0xfbe8, 0xfbe9,
			0x64a, 0xfef1, 0xfef2, 0xfef3, 0xfef4, 0x67e, 0xfb56, 0xfb57,
			0xfb58, 0xfb59, 0x686, 0xfb7a, 0xfb7b, 0xfb7c, 0xfb7d, 0x698,
			0xfb8a, 0xfb8b, 0xfb8a, 0xfb8b, 0x6ad, 0xfbd3, 0xfbd4, 0xfbd5,
			0xfbd6, 0x6af, 0xfb92, 0xfb93, 0xfb94, 0xfb95, 0x6be, 0xfbaa,
			0xfbab, 0xfbac, 0xfbad, 0x6c6, 0xfbd9, 0xfbda, 0xfbd9, 0xfbda,
			0x6c7, 0xfbd7, 0xfbd8, 0xfbd7, 0xfbd8, 0x6c8, 0xfbdb, 0xfbdc,
			0xfbdb, 0xfbdc, 0x6cb, 0xfbde, 0xfbdf, 0xfbde, 0xfbdf, 0x6d0,
			0xfbe4, 0xfbe5, 0xfbe6, 0xfbe7, 0x6d5, 0xfee9, 0xfeea, 0xfee9,
			0xfeea, 0x6a7, 0xfed1, 0xfed2, 0xfed3, 0xfed4, 0xfefb, 0xfefc };

	public boolean hasUyghurLettersExtra(char str) {

		if (FindCharFromMinCodes(str) > 0) {
			return true;
		}

		return false;
	}

	public kuozhan() {
		int i;

		for (i = 0; i < cmap.length; i++) {
			cmap[i] = '\0';
		}

		for (i = 0; i < cmapinv.length; i++) {
			cmapinv[i] = '\0';
		}

		cmap['A'] = '\u0627';
		cmap['a'] = '\u0627';
		cmap['B'] = '\u0628';
		cmap['b'] = '\u0628';
		cmap['C'] = '\u0643';
		cmap['c'] = '\u0643';
		cmap['D'] = '\u062F';
		cmap['d'] = '\u062F';
		cmap['E'] = '\u06D5';
		cmap['e'] = '\u06D5';
		cmap['F'] = '\u0641';
		cmap['f'] = '\u0641';
		cmap['G'] = '\u06AF';
		cmap['g'] = '\u06AF';
		cmap['H'] = '\u06BE';
		cmap['h'] = '\u06BE';
		cmap['I'] = '\u0649';
		cmap['i'] = '\u0649';
		cmap['J'] = '\u062C';
		cmap['j'] = '\u062C';
		cmap['K'] = '\u0643';
		cmap['k'] = '\u0643';
		cmap['L'] = '\u0644';
		cmap['l'] = '\u0644';
		cmap['M'] = '\u0645';
		cmap['m'] = '\u0645';
		cmap['N'] = '\u0646';
		cmap['n'] = '\u0646';
		cmap['O'] = '\u0648';
		cmap['o'] = '\u0648';
		cmap['P'] = '\u067E';
		cmap['p'] = '\u067E';
		cmap['Q'] = '\u0642';
		cmap['q'] = '\u0642';
		cmap['R'] = '\u0631';
		cmap['r'] = '\u0631';
		cmap['S'] = '\u0633';
		cmap['s'] = '\u0633';
		cmap['T'] = '\u062A';
		cmap['t'] = '\u062A';
		cmap['U'] = '\u06C7';
		cmap['u'] = '\u06C7';
		cmap['V'] = '\u06CB';
		cmap['v'] = '\u06CB';
		cmap['W'] = '\u06CB';
		cmap['w'] = '\u06CB';
		cmap['X'] = '\u062E';
		cmap['x'] = '\u062E';
		cmap['Y'] = '\u064A';
		cmap['y'] = '\u064A';
		cmap['Z'] = '\u0632';
		cmap['z'] = '\u0632';

		cmap['É'] = '\u06D0';
		cmap['é'] = '\u06D0';
		cmap['ö'] = '\u06C6';
		cmap['Ö'] = '\u06C6';
		cmap['Ü'] = '\u06C8';
		cmap['ü'] = '\u06C8';

		cmap[';'] = '\u061B';
		cmap['?'] = '\u061F';
		cmap[','] = '\u060C';

		for (i = 0; i < pform.length; i++) {
			pform[i] = null;
		}

		pform[cmap['a'] - BPAD] = new Ligatures('\uFE8D', '\uFE8D', '\uFE8D',
				'\uFE8E', Begtype.WDBEG);
		pform[cmap['e'] - BPAD] = new Ligatures('\uFEE9', '\uFEE9', '\uFEE9',
				'\uFEEA', Begtype.WDBEG);
		pform[cmap['b'] - BPAD] = new Ligatures('\uFE8F', '\uFE91', '\uFE92',
				'\uFE90', Begtype.NOBEG);
		pform[cmap['p'] - BPAD] = new Ligatures('\uFB56', '\uFB58', '\uFB59',
				'\uFB57', Begtype.NOBEG);
		pform[cmap['t'] - BPAD] = new Ligatures('\uFE95', '\uFE97', '\uFE98',
				'\uFE96', Begtype.NOBEG);
		pform[cmap['j'] - BPAD] = new Ligatures('\uFE9D', '\uFE9F', '\uFEA0',
				'\uFE9E', Begtype.NOBEG);
		pform[CHEE - BPAD] = new Ligatures('\uFB7A', '\uFB7C', '\uFB7D',
				'\uFB7B', Begtype.NOBEG);
		pform[cmap['x'] - BPAD] = new Ligatures('\uFEA5', '\uFEA7', '\uFEA8',
				'\uFEA6', Begtype.NOBEG);
		pform[cmap['d'] - BPAD] = new Ligatures('\uFEA9', '\uFEA9', '\uFEAA',
				'\uFEAA', Begtype.INBEG);
		pform[cmap['r'] - BPAD] = new Ligatures('\uFEAD', '\uFEAD', '\uFEAE',
				'\uFEAE', Begtype.INBEG);
		pform[cmap['z'] - BPAD] = new Ligatures('\uFEAF', '\uFEAF', '\uFEB0',
				'\uFEB0', Begtype.INBEG);
		pform[SZEE - BPAD] = new Ligatures('\uFB8A', '\uFB8A', '\uFB8B',
				'\uFB8B', Begtype.INBEG);
		pform[cmap['s'] - BPAD] = new Ligatures('\uFEB1', '\uFEB3', '\uFEB4',
				'\uFEB2', Begtype.NOBEG);
		pform[SHEE - BPAD] = new Ligatures('\uFEB5', '\uFEB7', '\uFEB8',
				'\uFEB6', Begtype.NOBEG);
		pform[GHEE - BPAD] = new Ligatures('\uFECD', '\uFECF', '\uFED0',
				'\uFECE', Begtype.NOBEG);
		pform[cmap['f'] - BPAD] = new Ligatures('\uFED1', '\uFED3', '\uFED4',
				'\uFED2', Begtype.NOBEG);
		pform[cmap['q'] - BPAD] = new Ligatures('\uFED5', '\uFED7', '\uFED8',
				'\uFED6', Begtype.NOBEG);
		pform[cmap['k'] - BPAD] = new Ligatures('\uFED9', '\uFEDB', '\uFEDC',
				'\uFEDA', Begtype.NOBEG);
		pform[cmap['g'] - BPAD] = new Ligatures('\uFB92', '\uFB94', '\uFB95',
				'\uFB93', Begtype.NOBEG);
		pform[NGEE - BPAD] = new Ligatures('\uFBD3', '\uFBD5', '\uFBD6',
				'\uFBD4', Begtype.NOBEG);
		pform[cmap['l'] - BPAD] = new Ligatures('\uFEDD', '\uFEDF', '\uFEE0',
				'\uFEDE', Begtype.NOBEG);
		pform[cmap['m'] - BPAD] = new Ligatures('\uFEE1', '\uFEE3', '\uFEE4',
				'\uFEE2', Begtype.NOBEG);
		pform[cmap['n'] - BPAD] = new Ligatures('\uFEE5', '\uFEE7', '\uFEE8',
				'\uFEE6', Begtype.NOBEG);
		pform[cmap['h'] - BPAD] = new Ligatures('\uFEEB', '\uFEEB', '\uFEEC',
				'\uFEEC', Begtype.NOBEG);
		pform[cmap['h'] - BPAD] = new Ligatures('\uFBAA', '\uFBAA', '\uFBAD',
				'\uFBAD', Begtype.NOBEG);
		pform[cmap['o'] - BPAD] = new Ligatures('\uFEED', '\uFEED', '\uFEEE',
				'\uFEEE', Begtype.INBEG);
		pform[cmap['u'] - BPAD] = new Ligatures('\uFBD7', '\uFBD7', '\uFBD8',
				'\uFBD8', Begtype.INBEG);
		pform[cmap['Ö'] - BPAD] = new Ligatures('\uFBD9', '\uFBD9', '\uFBDA',
				'\uFBDA', Begtype.INBEG);
		pform[cmap['ü'] - BPAD] = new Ligatures('\uFBDB', '\uFBDB', '\uFBDC',
				'\uFBDC', Begtype.INBEG);
		pform[cmap['w'] - BPAD] = new Ligatures('\uFBDE', '\uFBDE', '\uFBDF',
				'\uFBDF', Begtype.INBEG);
		pform[cmap['é'] - BPAD] = new Ligatures('\uFBE4', '\uFBE6', '\uFBE7',
				'\uFBE5', Begtype.NOBEG);
		pform[cmap['i'] - BPAD] = new Ligatures('\uFEEF', '\uFBE8', '\uFBE9',
				'\uFEF0', Begtype.NOBEG);
		pform[cmap['y'] - BPAD] = new Ligatures('\uFEF1', '\uFEF3', '\uFEF4',
				'\uFEF2', Begtype.NOBEG);
		pform[HAMZA - BPAD] = new Ligatures('\uFE8B', '\uFE8B', '\uFE8C',
				'\uFB8C', Begtype.NOBEG);

	}

	public String Reshape(String str) {
		// char[] rev=new char[str.length()];
		// for(int ii=0; ii<str.length(); ++ii)
		// rev[ii] = str.charAt(str.length()-ii-1);
		// str=new String(rev);
		Ligatures lsyn = pform[cmap['l'] - BPAD];
		Ligatures syn, tsyn;
		Begtype bt = Begtype.WDBEG;

		String wp = str;
		String pfstr = "";
		int n = str.length();
		int i, j = 0;
		char wc; // current char
		char pfwc = '\0'; // presentation form char
		char prevwc = '\0'; // previous char
		char ppfwc = '\0'; // previous presenation form char

		char[] pfwp = new char[n];

		for (i = 0; i < n; i++) {
			wc = wp.charAt(i);
			if (BPAD <= wc && wc < BMAX) {
				syn = pform[wc - BPAD];

				if (syn != null) {
					if (bt == Begtype.WDBEG) {
						pfwc = syn.iform;
					} else if (bt == Begtype.INBEG) {
						pfwc = syn.iform;
					} else if (bt == Begtype.NOBEG) {
						pfwc = syn.eform;
					}

					if (bt != Begtype.WDBEG) {
						tsyn = pform[prevwc - BPAD];

						// special cases for LA and _LA
						if (ppfwc == lsyn.iform && wc == cmap['a']) {
							pfwp[j - 1] = LA;
							bt = Begtype.WDBEG;
							continue;
						} else if (ppfwc == lsyn.eform && wc == cmap['a']) {
							pfwp[j - 1] = _LA;
							bt = Begtype.WDBEG;
							continue;
						}

						// update previous character
						if (ppfwc == tsyn.iform) {
							pfwp[j - 1] = tsyn.bform;
						} else if (ppfwc == tsyn.eform) {
							pfwp[j - 1] = tsyn.mform;
						}
					}
					bt = syn.btype; // we will need this in next round
				} else { // a non-Uyghur char in basic range
					pfwc = wc;
					bt = Begtype.WDBEG;
				}
			} else { // not in basic Arabic range ( 0x0600-0x06FF )
				pfwc = wc;
				bt = Begtype.WDBEG;
			}

			pfwp[j] = pfwc;
			ppfwc = pfwc; // previous presentation form wide character
			prevwc = wc;
			j++;
		}

		pfstr = new String(pfwp, 0, j);
		if (pfstr.contains(String.valueOf(LA))
				|| pfstr.contains(String.valueOf(_LA))) {
			pfstr = pfstr + " ";
		}
		return pfstr;
	}

	public Boolean isalpha(int ch) {
		if (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')) {
			return true;
		}

		return false;
	}

	public class Ligatures {
		public char iform, bform, mform, eform;
		public Begtype btype;

		public Ligatures(char i, char b, char m, char e, Begtype bt) {
			this.iform = i;
			this.bform = b;
			this.mform = m;
			this.eform = e;
			this.btype = bt;
		}
	}

	public boolean IsUychar(char c) {
		int DEFINED_STARTING_OF_UYGHUR_UNICODE = 0x0600;
		int DEFINED_END_OF_UYGHUR_UNICODE = 0xffff;
		boolean isuy = false;
		if (c >= DEFINED_STARTING_OF_UYGHUR_UNICODE
				&& c <= DEFINED_END_OF_UYGHUR_UNICODE) {
			isuy = true;
		}
		return isuy;

	}

	public int hasUyghurLettersExtra(String str) {
		if (str.trim() == "")
			return 0;
		int i = 0;
		for (; i < str.length(); i++) {
			if (FindCharFromMinCodes(str.charAt(i)) > 0) {
				return 1;
			}
		}
		return 0;
	}

	public int FindCharFromMinCodes(char item) {
		for (int i = 0; i < this.UyCodes.length; i++) {
			if (UyCodes[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
