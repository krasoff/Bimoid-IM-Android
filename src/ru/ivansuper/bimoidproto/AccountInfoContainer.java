package ru.ivansuper.bimoidproto;

import ru.ivansuper.locale.Locale;

public class AccountInfoContainer {
	public static String[] countries;
	public static String[] languages;
	public static String[] zodiacs;
	public static String[] genders;
	public static final void preloadLocale(){
		countries = new String[]{
		" - ",
		Locale.getString("s_country_1"),
		Locale.getString("s_country_2"),
		Locale.getString("s_country_3"),
		Locale.getString("s_country_4"),
		Locale.getString("s_country_5"),
		Locale.getString("s_country_6"),
		Locale.getString("s_country_7"),
		Locale.getString("s_country_8"),
		Locale.getString("s_country_9"),
		Locale.getString("s_country_10"),
		Locale.getString("s_country_11"),
		Locale.getString("s_country_12"),
		Locale.getString("s_country_13"),
		Locale.getString("s_country_14"),
		Locale.getString("s_country_15"),
		Locale.getString("s_country_15"),
		Locale.getString("s_country_16"),
		Locale.getString("s_country_17"),
		Locale.getString("s_country_18"),
		Locale.getString("s_country_19"),
		Locale.getString("s_country_20"),
		Locale.getString("s_country_21"),
		Locale.getString("s_country_22"),
		Locale.getString("s_country_23"),
		Locale.getString("s_country_24"),
		Locale.getString("s_country_25"),
		Locale.getString("s_country_26"),
		Locale.getString("s_country_27"),
		Locale.getString("s_country_28"),
		Locale.getString("s_country_29"),
		Locale.getString("s_country_30"),
		Locale.getString("s_country_31"),
		Locale.getString("s_country_32"),
		Locale.getString("s_country_33"),
		Locale.getString("s_country_34"),
		Locale.getString("s_country_35"),
		Locale.getString("s_country_36"),
		Locale.getString("s_country_37"),
		Locale.getString("s_country_38"),
		Locale.getString("s_country_39"),
		Locale.getString("s_country_40"),
		Locale.getString("s_country_41"),
		Locale.getString("s_country_42"),
		Locale.getString("s_country_43"),
		Locale.getString("s_country_44"),
		Locale.getString("s_country_45"),
		Locale.getString("s_country_46"),
		Locale.getString("s_country_47"),
		Locale.getString("s_country_48"),
		Locale.getString("s_country_49"),
		Locale.getString("s_country_50"),
		Locale.getString("s_country_51"),
		Locale.getString("s_country_52"),
		Locale.getString("s_country_53"),
		Locale.getString("s_country_54"),
		Locale.getString("s_country_55"),
		Locale.getString("s_country_56"),
		Locale.getString("s_country_57"),
		Locale.getString("s_country_58"),
		Locale.getString("s_country_59"),
		Locale.getString("s_country_60"),
		Locale.getString("s_country_61"),
		Locale.getString("s_country_62"),
		Locale.getString("s_country_63"),
		Locale.getString("s_country_64"),
		Locale.getString("s_country_65"),
		Locale.getString("s_country_66"),
		Locale.getString("s_country_67"),
		Locale.getString("s_country_68"),
		Locale.getString("s_country_69"),
		Locale.getString("s_country_70"),
		Locale.getString("s_country_71"),
		Locale.getString("s_country_72"),
		Locale.getString("s_country_73"),
		Locale.getString("s_country_74"),
		Locale.getString("s_country_75"),
		Locale.getString("s_country_76"),
		Locale.getString("s_country_77"),
		Locale.getString("s_country_78"),
		Locale.getString("s_country_79"),
		Locale.getString("s_country_80"),
		Locale.getString("s_country_81"),
		Locale.getString("s_country_82"),
		Locale.getString("s_country_83"),
		Locale.getString("s_country_84"),
		Locale.getString("s_country_85"),
		Locale.getString("s_country_86"),
		Locale.getString("s_country_87"),
		Locale.getString("s_country_88"),
		Locale.getString("s_country_89"),
		Locale.getString("s_country_90"),
		Locale.getString("s_country_91"),
		Locale.getString("s_country_92"),
		Locale.getString("s_country_93"),
		Locale.getString("s_country_94"),
		Locale.getString("s_country_95"),
		Locale.getString("s_country_96"),
		Locale.getString("s_country_97"),
		Locale.getString("s_country_98"),
		Locale.getString("s_country_99"),
		Locale.getString("s_country_100"),
		Locale.getString("s_country_101"),
		Locale.getString("s_country_102"),
		Locale.getString("s_country_103"),
		Locale.getString("s_country_104"),
		Locale.getString("s_country_105"),
		Locale.getString("s_country_106"),
		Locale.getString("s_country_107"),
		Locale.getString("s_country_108"),
		Locale.getString("s_country_109"),
		Locale.getString("s_country_110"),
		Locale.getString("s_country_111"),
		Locale.getString("s_country_112"),
		Locale.getString("s_country_113"),
		Locale.getString("s_country_114"),
		Locale.getString("s_country_115"),
		Locale.getString("s_country_116"),
		Locale.getString("s_country_117"),
		Locale.getString("s_country_118"),
		Locale.getString("s_country_119"),
		Locale.getString("s_country_120"),
		Locale.getString("s_country_121"),
		Locale.getString("s_country_122"),
		Locale.getString("s_country_123"),
		Locale.getString("s_country_124"),
		Locale.getString("s_country_125"),
		Locale.getString("s_country_126"),
		Locale.getString("s_country_127"),
		Locale.getString("s_country_128"),
		Locale.getString("s_country_129"),
		Locale.getString("s_country_130"),
		Locale.getString("s_country_131"),
		Locale.getString("s_country_132"),
		Locale.getString("s_country_133"),
		Locale.getString("s_country_134"),
		Locale.getString("s_country_135"),
		Locale.getString("s_country_136"),
		Locale.getString("s_country_137"),
		Locale.getString("s_country_138"),
		Locale.getString("s_country_139"),
		Locale.getString("s_country_140"),
		Locale.getString("s_country_141"),
		Locale.getString("s_country_142"),
		Locale.getString("s_country_143"),
		Locale.getString("s_country_144"),
		Locale.getString("s_country_145"),
		Locale.getString("s_country_146"),
		Locale.getString("s_country_147"),
		Locale.getString("s_country_148"),
		Locale.getString("s_country_149"),
		Locale.getString("s_country_150"),
		Locale.getString("s_country_151"),
		Locale.getString("s_country_152"),
		Locale.getString("s_country_153"),
		Locale.getString("s_country_154"),
		Locale.getString("s_country_155"),
		Locale.getString("s_country_156"),
		Locale.getString("s_country_157"),
		Locale.getString("s_country_158"),
		Locale.getString("s_country_159"),
		Locale.getString("s_country_160"),
		Locale.getString("s_country_161"),
		Locale.getString("s_country_162"),
		Locale.getString("s_country_163"),
		Locale.getString("s_country_164"),
		Locale.getString("s_country_165"),
		Locale.getString("s_country_166"),
		Locale.getString("s_country_167"),
		Locale.getString("s_country_168"),
		Locale.getString("s_country_169"),
		Locale.getString("s_country_170"),
		Locale.getString("s_country_171"),
		Locale.getString("s_country_172"),
		Locale.getString("s_country_173"),
		Locale.getString("s_country_174"),
		Locale.getString("s_country_175"),
		Locale.getString("s_country_176"),
		Locale.getString("s_country_177"),
		Locale.getString("s_country_178"),
		Locale.getString("s_country_179"),
		Locale.getString("s_country_180"),
		Locale.getString("s_country_181"),
		Locale.getString("s_country_182"),
		Locale.getString("s_country_183"),
		Locale.getString("s_country_184"),
		Locale.getString("s_country_185"),
		Locale.getString("s_country_186"),
		Locale.getString("s_country_187"),
		Locale.getString("s_country_188"),
		Locale.getString("s_country_189"),
		Locale.getString("s_country_190"),
		Locale.getString("s_country_191"),
		Locale.getString("s_country_192"),
		Locale.getString("s_country_193"),
		Locale.getString("s_country_194"),
		Locale.getString("s_country_195"),
		Locale.getString("s_country_196"),
		Locale.getString("s_country_197"),
		Locale.getString("s_country_198"),
		Locale.getString("s_country_199"),
		Locale.getString("s_country_200"),
		Locale.getString("s_country_201"),
		Locale.getString("s_country_202"),
		Locale.getString("s_country_203"),
		Locale.getString("s_country_204"),
		Locale.getString("s_country_205"),
		Locale.getString("s_country_206"),
		Locale.getString("s_country_207"),
		Locale.getString("s_country_208"),
		Locale.getString("s_country_209"),
		Locale.getString("s_country_210"),
		Locale.getString("s_country_211"),
		Locale.getString("s_country_212"),
		Locale.getString("s_country_213"),
		Locale.getString("s_country_214"),
		Locale.getString("s_country_215"),
		Locale.getString("s_country_216"),
		Locale.getString("s_country_217"),
		Locale.getString("s_country_218"),
		Locale.getString("s_country_219"),
		Locale.getString("s_country_220"),
		Locale.getString("s_country_221"),
		Locale.getString("s_country_222"),
		Locale.getString("s_country_223"),
		Locale.getString("s_country_224"),
		Locale.getString("s_country_225"),
		Locale.getString("s_country_226"),
		Locale.getString("s_country_227"),
		Locale.getString("s_country_228"),
		Locale.getString("s_country_229"),
		Locale.getString("s_country_230"),
		Locale.getString("s_country_231"),
		Locale.getString("s_country_232"),
		Locale.getString("s_country_233"),
		Locale.getString("s_country_234"),
		Locale.getString("s_country_235"),
		Locale.getString("s_country_236"),
		Locale.getString("s_country_237"),
		Locale.getString("s_country_238"),
		Locale.getString("s_country_239"),
		Locale.getString("s_country_240"),
		Locale.getString("s_country_241"),
		Locale.getString("s_country_242"),
		Locale.getString("s_country_243"),
		Locale.getString("s_country_244"),
		Locale.getString("s_country_245")};
		languages = new String[]{
		" - ",
		Locale.getString("s_language_1"),
		Locale.getString("s_language_2"),
		Locale.getString("s_language_3"),
		Locale.getString("s_language_4"),
		Locale.getString("s_language_5"),
		Locale.getString("s_language_6"),
		Locale.getString("s_language_7"),
		Locale.getString("s_language_8"),
		Locale.getString("s_language_9"),
		Locale.getString("s_language_10"),
		Locale.getString("s_language_11"),
		Locale.getString("s_language_12"),
		Locale.getString("s_language_13"),
		Locale.getString("s_language_14"),
		Locale.getString("s_language_15"),
		Locale.getString("s_language_16"),
		Locale.getString("s_language_17"),
		Locale.getString("s_language_18"),
		Locale.getString("s_language_19"),
		Locale.getString("s_language_20"),
		Locale.getString("s_language_21"),
		Locale.getString("s_language_22"),
		Locale.getString("s_language_23"),
		Locale.getString("s_language_24"),
		Locale.getString("s_language_25"),
		Locale.getString("s_language_26"),
		Locale.getString("s_language_27"),
		Locale.getString("s_language_28"),
		Locale.getString("s_language_29"),
		Locale.getString("s_language_30"),
		Locale.getString("s_language_31"),
		Locale.getString("s_language_32"),
		Locale.getString("s_language_33"),
		Locale.getString("s_language_34"),
		Locale.getString("s_language_35"),
		Locale.getString("s_language_36"),
		Locale.getString("s_language_37"),
		Locale.getString("s_language_38"),
		Locale.getString("s_language_39"),
		Locale.getString("s_language_40"),
		Locale.getString("s_language_41"),
		Locale.getString("s_language_42"),
		Locale.getString("s_language_43"),
		Locale.getString("s_language_44"),
		Locale.getString("s_language_45"),
		Locale.getString("s_language_46"),
		Locale.getString("s_language_47"),
		Locale.getString("s_language_48"),
		Locale.getString("s_language_49"),
		Locale.getString("s_language_50"),
		Locale.getString("s_language_51"),
		Locale.getString("s_language_52"),
		Locale.getString("s_language_53"),
		Locale.getString("s_language_54"),
		Locale.getString("s_language_55"),
		Locale.getString("s_language_56"),
		Locale.getString("s_language_57"),
		Locale.getString("s_language_58"),
		Locale.getString("s_language_59"),
		Locale.getString("s_language_60"),
		Locale.getString("s_language_61"),
		Locale.getString("s_language_62"),
		Locale.getString("s_language_63"),
		Locale.getString("s_language_64"),
		Locale.getString("s_language_65"),
		Locale.getString("s_language_66"),
		Locale.getString("s_language_67"),
		Locale.getString("s_language_68"),
		Locale.getString("s_language_69"),
		Locale.getString("s_language_70"),
		Locale.getString("s_language_71"),
		Locale.getString("s_language_72")};
		genders = new String[]{
		" - ",
		Locale.getString("s_gender_w"),
		Locale.getString("s_gender_m")};
		zodiacs = new String[]{
		" - ",
		Locale.getString("s_zodiac_1"),
		Locale.getString("s_zodiac_2"),
		Locale.getString("s_zodiac_3"),
		Locale.getString("s_zodiac_4"),
		Locale.getString("s_zodiac_5"),
		Locale.getString("s_zodiac_6"),
		Locale.getString("s_zodiac_7"),
		Locale.getString("s_zodiac_8"),
		Locale.getString("s_zodiac_9"),
		Locale.getString("s_zodiac_10"),
		Locale.getString("s_zodiac_11"),
		Locale.getString("s_zodiac_12")};
	}
	public static final String[] ages = {
		" - ",
		"13 - 17",
		"18 - 22",
		"23 - 29",
		"30 - 39",
		"40 - 49",
		"50 - 59",
		"60 ..."};
	public static final int[] ages_mins = {
		0,
		13,
		18,
		23,
		30,
		40,
		50,
		60};
	public static final int[] ages_maxs = {
		0,
		17,
		22,
		29,
		39,
		49,
		59,
		255};
	public String nick_name = "";
	public String first_name = "";
	public String last_name = "";
	public String country = "";
	public String region = "";
	public String city = "";
	public String zipcode = "";
	public String address = "";
	public String language = "";
	public String additional_language = "";
	public String gender = "";
	public long birthday;
	public String homepage = "";
	public String about = "";
	public String interests = "";
	public String email = "";
	public String additional_email = "";
	public String home_phone = "";
	public String work_phone = "";
	public String cellular_phone = "";
	public String fax_number = "";
	public String company = "";
	public String departament = "";
	public String position = "";
	public String account_ = "";
	public int country_ = 0;
	public int language_ = 0;
	public int gender_ = 0;
	public int zodiac_ = 0;
	public int age_ = 0;
	public int age_min = 0;
	public int age_max = 0;
	public boolean online_;
}
