package com.software.rmh.walkthroughthebible.Models;

/**
 * Created by rhoffman on 2/5/17.
 * <p>
 * Storage of all locations in the KJV Bible.
 */

public class BibleLocationsKJV {

	/**
	 * Old Testament books of the Bible. All locations referenced in every chapter of every book is stored as a String[]
	 */
	private static final String[][] Genesis = {
		{null},
		{"Eden", "Pison", "Havilah", "Gihon", "Ethiopia", "Assyria", "Hiddekel", "Euphrates"},
		{"Eden"},
		{"Eden"},
		{null},
		{null},
		{null},
		{"Ararat"},
		{null},
		{"Babel", "Erech", "Accad", "Calneh", "Shinar", "Assyria", "Nineveh", "Rehoboth", "Resen", "Calah", "Sidon", "Gerar", "Gaza", "Sodom", "Gomorrah", "Admah", "Zeboim", "Lasha", "Mesha", "Sephar"},
		{"Shinar", "Babel", "Ur of the Chaldees", "Haran", "Canaan"},
		{"Haran", "Canaan", "Shechem", "Moreh", "Bethel", "Hai", "Egypt"},
		{"Egypt", "Negeb", "Bethel", "Hai", "plain of Jordan", "Zoar", "Sodom", "Gomorrah", "Canaan", "Mamre", "Hebron"},
		{"Shinar", "Ellasar", "Elam", "Sodom", "Gomorrah", "Admah", "Zeboiim", "Bela", "Zoar", "vale of Siddim", "salt sea", "Ashteroth Karnaim", "Ham", "Shaveh Kiriathaim", "Seir", "Elparan", "Enmishpat", "Kadesh", "Engedi", "Hazazontamar", "Hazezontamar", "Mamre", "Dan", "Hobah", "Damascus", "valley of Shaveh", "king's dale", "Salem"},
		{"Damascus", "Ur of the Chaldees", "Egypt", "Euphrates"},
		{"Canaan", "Shur", "Beerlahairoi", "Kadesh", "Bered"},
		{"Canaan"},
		{"Mamre", "Sodom", "Gomorrah"},
		{"Sodom", "Zoar", "Gomorrah"},
		{"Negeb", "Kadesh", "Shur", "Gerar"},
		{"Beersheba", "wilderness of Paran", "Egypt"},
		{"Moriah", "Beersheba"},
		{"Kirjatharba", "Hebron", "Canaan", "Machpelah", "Mamre"},
		{"Mesopotamia", "Nahor", "Beerlahairoi", "Negeb"},
		{"Machpelah", "Ephron", "Mamre", "Beerlahairoi", "Havilah", "Shur", "Egypt", "Assyria", "Padanaram"},
		{"Gerar", "Egypt", "valley of Gerar", "Esek", "Sitnah", "Rehoboth", "Beersheba"},
		{"Haran"},
		{"Padanaram", "Beersheba", "Haran", "Bethel", "Luz"},
		{"Haran"},
		{null},
		{"Bethel", "Canaan", "Euphrates", "Gilead", "Jegarsahadutha", "Galeed", "Mizpah"},
		{"Mahanaim", "Seir", "Edom", "Jordan", "Jabbok", "Penuel"},
		{"Seir", "Succoth", "Shechem", "Canaan", "Padanaram", "EleloheIsrael"},
		{"Israel", "Shechem"},
		{"Bethel", "Shechem", "Luz", "Canaan", "Elbethel", "Allonbachuth", "Ephrath", "Bethlehem", "Edar", "Padanaram", "Mamre", "Kirjatharba", "Hebron"},
		{"Canaan", "Seir", "Edom", "Dinhabah", "Moab", "Avith", "Euphrates"},
		{"Canaan", "Shechem", "vale of Hebron", "Dothan", "Gilead", "Egypt"},
		{"Chezib", "Timnah"},
		{"Egypt"},
		{"Egypt"},
		{"the river", "Egypt"},
		{"Egypt", "Canaan"},
		{"Egypt"},
		{"Canaan"},
		{"Egypt", "Goshen", "Canaan"},
		{"Beersheba", "Egypt", "Canaan", "Padanaram", "Goshen"},
		{"Canaan", "Goshen", "Egypt", "Rameses"},
		{"Luz", "Canaan", "Egypt", "Padan", "Ephrath", "Bethlehem"},
		{"Sidon", "Ephron", "Machpelah", "Mamre", "Canaan"},
		{"Canaan", "Egypt", "Goshen", "Atad", "Jordan", "Abelmizraim", "Machpelah", "Mamre", "Ephron"}
	};

	private static final String[][] Exodus = {
		{"Egypt", "Pithom", "Raamses", "the river"},
		{"Midian", "Egypt"},
		{"Midian", "Horeb", "Egypt"},
		{"the river", "Egypt", "Midian"},
		{"Egypt"},
		{"Canaan", "Egypt"},
		{"Egypt", "the river"},
		{"the river", "Egypt", "Goshen"},
		{"Egypt", "Goshen"},
		{"Egypt", "Red sea"},
		{"Egypt"},
		{"Egypt", "Rameses", "Succoth (Egypt)"},
		{"Egypt", "Red sea", "Succoth (Egypt)", "Etham"},
		{"Pihahiroth", "Migdol", "Baalzephon", "Egypt"},
		{"Red sea", "Palestina", "Edom", "Moab", "Canaan", "Shur", "Marah", "Elim"},
		{"Elim", "wilderness of Sin", "Sinai", "Egypt", "Canaan"},
		{"wilderness of Sin", "Rephidim", "Egypt", "the river", "Horeb", "Massah", "Meribah in Sinai"},
		{"Midian", "Egypt"},
		{"Egypt", "Sinai", "Rephidim", "mount Sinai"},
		{"Egypt"},
		{null},
		{"Egypt"},
		{"Egypt", "Red sea", "sea of the Philistines", "Euphrates"},
		{"mount Sinai"},
		{null},
		{null},
		{null},
		{null},
		{"Egypt"},
		{null},
		{"mount Sinai"},
		{"Egypt"},
		{"Egypt", "mount Horeb"},
		{"mount Sinai", "Egypt"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null}
	};

	private static final String[][] Leviticus = {
		{"Israel"},
		{null},
		{null},
		{"Israel"},
		{null},
		{null},
		{"Israel", "mount Sinai", "wilderness of Sinai"},
		{null},
		{"Israel"},
		{"Israel"},
		{"Egypt", "Israel"},
		{"Israel"},
		{null},
		{"Canaan"},
		{"Israel"},
		{"Israel"},
		{"Israel"},
		{"Canaan", "Egypt", "Israel"},
		{"Egypt", "Israel"},
		{"Israel"},
		{"Israel"},
		{"Egypt", "Israel"},
		{"Egypt", "Israel"},
		{"Dan", "Egypt", "Israel"},
		{"Canaan", "Egypt", "Israel", "mount Sinai"},
		{"Egypt", "Israel", "mount Sinai"},
		{"Israel", "mount Sinai"}
	};

	private static final String[][] Numbers = {
		{"wilderness of Sinai", "Egypt"},
		{null},
		{"mount Sinai", "wilderness of Sinai", "Egypt"},
		{null},
		{null},
		{null},
		{null},
		{"Egypt"},
		{"wilderness of Sinai", "Egypt"},
		{"wilderness of Sinai", "wilderness of Paran"},
		{"Taberah", "Egypt", "Kibrothhattaavah", "Hazeroth"},
		{"Hazeroth", "wilderness of Paran"},
		{"Canaan", "wilderness of Paran", "wilderness of Zin", "Rehob", "Hamath", "Negeb", "Hebron", "Zoan", "Egypt", "valley of Eshcol", "Kadesh", "Jordan"},
		{"Egypt", "Red sea", "Hormah"},
		{"Egypt"},
		{null},
		{null},
		{null},
		{null},
		{"wilderness of Zin", "Kadesh", "Meribah", "Edom", "Egypt", "mount Hor"},
		{"Arad", "Negeb", "Atharim", "Hormah", "mount Hor", "Red sea", "Edom", "Egypt", "Oboth", "Ijeabarim", "Moab", "valley of Zared", "Arnon", "Red sea", "Beer", "Mattanah", "Bamoth", "Pisgah", "Jahaz", "Jabbok", "Heshbon", "Dibon", "Nophah", "Medeba", "Jazer", "Bashan", "Edrei"},
		{"Moab", "Jordan", "Jericho", "Midian", "Pethor", "Amaw", "Egypt", "Arnon", "Kirjathhuzoth", "Bamothbaal"},
		{"Moab", "Aram", "Zophim", "Pisgah", "Egypt", "Peor"},
		{"Egypt", "Moab", "Edom", "Seir", "Kain", "Asshur", "Chittim"},
		{"Shittim", "Moab", "Peor", "Midian"},
		{"Moab", "Jordan", "Jericho", "Egypt", "wilderness of Sinai", "Canaan"},
		{"Abarim", "wilderness of Zin", "Meribah", "Kadesh"},
		{"mount Sinai"},
		{null},
		{null},
		{"Midian", "Moab", "Jordan", "Jericho", "Peor"},
		{"Jazer", "Gilead", "Ataroth", "Dibon", "Nimrah", "Heshbon", "Elealeh", "Shebam", "Nebo", "Beon", "Jordan", "Kadeshbarnea", "valley of Eshcol", "Egypt", "Bashan", "Aroer", "Atroth, Shophan", "Jogbehah", "Bethnimrah", "Bethharan", "Kiriathaim", "Baalmeon", "Shibmah", "Havothjair", "Nobah", "Kenath"},
		{"Egypt", "Rameses", "Succoth (Egypt)", "Etham", "Pihahiroth", "Baalzephon", "Migdol", "Marah", "Elim", "Red sea", "wilderness of Sin", "Dophkah", "Alush", "Rephidim", "wilderness of Sinai", "Kibrothhattaavah", "Hazeroth", "Rithmah", "Rimmonparez", "Libnah", "Rissah", "Kehelathah", "mount Shapher", "Haradah", "Makheloth", "Tahath", "Terah", "Mithcah", "Hashmonah", "Moseroth", "Benejaakan", "Horhagidgad", "Jotbathah", "Ebronah", "Eziongaber", "wilderness of Zin", "Kadesh", "mount Hor", "Edom", "Arad", "Canaan", "Zalmonah", "Punon", "Oboth", "Ijeabarim", "Moab", "Iim", "Dibongad", "Almondiblathaim", "Abarim", "Nebo", "Jordan", "Jericho", "Bethjesimoth", "Abelshittim"},
		{"Canaan", "wilderness of Zin", "Edom", "salt sea", "Akrabbim", "Zin", "Kadeshbarnea", "Hazaraddar", "Azmon", "river of Egypt", "great sea", "mount Hor", "Hamath", "Zedad", "Ziphron", "Hazarenan", "Shepham", "Riblah", "Ain", "sea of Chinnereth", "Jordan", "Jericho"},
		{"Moab", "Jordan", "Jericho", "Canaan"},
		{"Gilead", "Moab", "Jordan", "Jericho"}
	};

	private static final String[][] Deuteronomy = {
		{"Bashan", "Canaan", "Dizahab", "Egypt", "Edrei", "Horeb", "Heshbon", "Hazeroth", "Hormah", "Israel", "Jordan", "Kadeshbarnea", "Lebanon", "Laban", "mount Seir", "Moab", "Paran", "Red sea", "Tophel", "the river Euphrates", "valley of Eshcol", "wilderness"},
		{"Aroer", "Ammon", "Arnon", "Ar", "Azzah", "brook Zered", "Esau", "Eziongaber", "Elath", "Gilead", "Heshbon", "Israel", "Jabbok", "Jordan", "Jahaz", "Kedemoth", "Kadeshbarnea", "mount Seir", "Moab", "Red sea", "Seir"},
		{"Aroer", "Ammon", "Arnon", "Argob", "Ar", "Bethpeor", "Bashan", "Chinnereth", "Edrei", "Gilead", "Geshuri", "Heshbon", "Israel", "Jabbok", "Jair", "Jordan", "Lebanon", "mount Hermon", "Pisgah", "salt sea", "Sidon"},
		{"Aroer", "Arnon", "Ar", "Baalpeor", "Bethpeor", "Bashan", "Bezer", "Egypt", "Golan", "Gilead", "Horeb", "Heshbon", "Israel", "Jordan", "Pisgah", "Ramoth", "Sion", "wilderness"},
		{"Egypt", "Horeb", "Israel"},
		{"Egypt", "Israel", "Massah"},
		{"Egypt"},
		{"Egypt", "wilderness"},
		{"Egypt", "Horeb", "Israel", "Jordan", "Kadeshbarnea", "Kibrothhattaavah", "Massah", "Taberah", "wilderness"},
		{"Beeroth", "Egypt", "Israel"},
		{"Egypt", "the river Euphrates", "Gilgal", "Israel", "Jordan", "Lebanon", "Moreh", "mount Ebal", "mount Gerizim", "Red sea", "wilderness"},
		{"Jordan"},
		{"Egypt", "Israel"},
		{null},
		{"Egypt"},
		{"Egypt"},
		{"Egypt", "Israel"},
		{"Horeb", "Israel"},
		{"Israel"},
		{"Egypt", "Israel"},
		{"Israel"},
		{"Israel"},
		{"Ammon", "Egypt", "Edom", "Israel", "Moab", "Mesopotamia", "Pethor"},
		{"Egypt", "Israel"},
		{"Amalek", "Egypt", "Israel"},
		{"Egypt", "Israel", "Syria"},
		{"Dan", "Israel", "Jordan", "mount Ebal", "mount Gerizim"},
		{"Egypt"},
		{"Admah", "Bashan", "Egypt", "Gomorrah", "Horeb", "Heshbon", "Israel", "Moab", "Sodom", "wilderness", "Zeboim"},
		{"Jordan"},
		{"Israel", "Jordan"},
		{"Abarim", "Bashan", "Canaan", "Gomorrah", "Israel", "Jordan", "Jericho", "Kadesh", "Meribah", "mount Hor", "Moab", "mount Nebo", "Nebo", "Sodom", "wilderness of Zin"},
		{"Bashan", "Israel", "Meribah", "mount Paran", "Massah", "Sinai", "Seir"},
		{"Bethpeor", "Dan", "Egypt", "Ephraim", "Gilead", "Israel", "Jericho", "Moab", "Nebo", "Pisgah", "valley of Jericho", "Zoar"}
	};

	private static final String[][] Joshua = {
		{"Jordan", "Israel", "the wilderness", "Lebanon", "the river Euphrates", "great sea"},
		{"Shittim", "Jericho", "Israel", "Jordan", "Red sea", "Egypt"},
		{"Shittim", "Jordan", "Israel", "Adam", "salt sea", "Jericho"},
		{"Jordan", "Israel", "Jericho", "Gilgal", "Red sea"},
		{"Jordan", "Israel", "Egypt", "wilderness", "Gilgal", "Jericho", "Canaan"},
		{"Jericho", "Israel"},
		{"Ai", "Israel", "Jericho", "Bethaven", "Bethel", "Shebarim", "Jordan", "valley of Achor"},
		{"Ai", "Jericho", "Bethel", "wilderness", "Israel", "mount Ebal", "mount Gerizim"},
		{"Jordan", "great sea", "Lebanon", "Israel", "Gibeon", "Jericho", "Ai", "Gilgal", "Egypt", "Heshbon", "Bashan", "Ashtaroth", "Chephirah", "Beeroth", "Kirjathjearim"},
		{"Jerusalem", "Ai", "Jericho", "Gibeon", "Israel", "Hebron", "Warmth", "Lachish", "Eglon", "Gilgal", "Jarmuth", "Azekah", "Makkedah", "Libnah", "Gezer", "Kadeshbarnea", "Gaza", "Goshen", "Bethhoron"},
		{"Anab", "Ashdod", "Achshaph", "Canaan", "Chinneroth", "Cana", "Debir", "Dor", "Gaza", "Goshen", "Gibeon", "Gath", "Hazor", "Hebron", "Israel", "Lebanon", "Merom", "Misrephothmaim", "mount Halak", "Mizpeh", "Madon", "mount Hermon", "Shimron", "Seir", "valley of Mizpeh"},
		{"Aroer", "Ammon", "Arad", "Arnon", "Adullam", "Ar", "Ashtaroth", "Achshaph", "Aphek", "Bashan", "Bethel", "Carmel", "Canaan", "Chinneroth", "Cana", "Debir", "Dor", "Edrei", "Eglon", "Gezer", "Gilead", "Gilgal", "Geshuri", "Hazor", "Hebron", "Heshbon", "Hepher", "Hormah", "Israel", "Jokneam", "Jabbok", "Jerusalem", "Jordan", "Jarmuth", "Jericho", "Kedesh", "Libnah", "Lebanon", "Lachish", "Megiddo", "Makkedah", "mount Halak", "Madon", "mount Hermon", "salt sea", "Seir", "Taanach", "Tirzah", "Tappuah", "wilderness"},
		{"Aroer", "Ammon", "Arnon", "Ar", "Ashtaroth", "Aphek", "Bamothbaal", "Bethnimrah", "Betonim", "Bamoth", "Bethpeor", "Bashan", "Canaan", "Chinnereth", "Debir", "Dibon", "Egypt", "Edrei", "Ekron", "Gilead", "Gaza", "Geshur", "Hamath", "Heshbon", "Israel", "Jazer", "Jair", "Jordan", "Jahaz", "Jericho", "Kedemoth", "Lebanon", "Mephaath", "Misrephothmaim", "Mahanaim", "Moab", "Midian", "mount Hermon", "Medeba", "Mearah", "Rama", "Ramah", "Rekem", "Sidon", "sea of Chinnereth", "Succoth", "Zaphon"},
		{"Canaan", "Ephraim", "Gilgal", "Hebron", "Israel", "Jordan", "Kadeshbarnea", "Kirjatharba", "wilderness"},
		{"Achzib", "Anab", "Amam", "Ain", "Adithaim", "Adadah", "Arab", "Adullam", "Azmon", "Ashdod", "Ashan", "Adummim", "Ashnah", "Anim", "Aphek", "Azekah", "Beersheba", "Bethdagon", "Bethtappuah", "Beer", "Bozkath", "Betharabah", "river of Egypt", "Bethzur", "Bethanoth", "Baalah", "Bethshemesh", "Carmel", "Chesalon", "Chesil", "Cabbon", "Dannah", "Debir", "Dumah", "Dilean", "Dimonah", "Dan", "Egypt", "Ether", "Eltolad", "Ephron", "Enshemesh", "Engannim", "Eshtaol", "Eltekon", "Enrogel", "Ekron", "Engedi", "Hazazontamar", "Hazezontamar", "Edom", "Enam", "Eglon", "Gederoth", "Gilgal", "great sea", "Gedor", "Gaza", "Goshen", "Giloh", "Gibeah", "Gederothaim", "Gederah", "Hazor", "Hazargaddah", "Hebron", "Humtah", "Hadashah", "Holon", "Halhul", "Hazarshual", "Hormah", "Heshmon", "Ithnan", "Iim", "Jerusalem", "Joktheel", "Jabneel", "Jokdeam", "Juttah", "Jattir", "Jezreel", "Jagur", "Jordan", "Jarmuth", "Kinah", "Kadesh", "Kabzeel", "Kedesh", "Kadeshbarnea", "Karkaa", "Keilah", "Kirjatharba", "Kirjathjearim", "Libnah", "Lebaoth", "Lachish", "Lahmam", "Mareshah", "Madmannah", "Makkedah", "Migdalgad", "mount Seir", "Maon", "Mizpeh", "Moladah", "mount Ephron", "Maarath", "mount Baalah", "Middin", "Nezib", "Naamah", "Nibshan", "Nephtoah", "Rimmon", "salt sea", "Secacah", "Sansannah", "Shema", "Shamir", "Socoh", "Seir", "Telem", "Timnah", "Tappuah", "valley of Hinnom", "valley of Achor", "wilderness of Zin", "Zior", "Zanoah", "Zin", "Ziph", "Zenan", "Ziklag"},
		{"Atarothaddar", "Ataroth", "Bethel", "Bethhoron", "Canaan", "Ephraim", "Gezer", "Jordan", "Jericho", "Kanah", "Luz", "Tappuah", "Taanathshiloh", "wilderness"},
		{"Bashan", "Canaan", "Dor", "Ephraim", "Endor", "Gilead", "Hepher", "Israel", "Ibleam", "Jezreel", "Jordan", "Kanah", "Megiddo", "Shechem", "Taanach", "Tirzah", "Tappuah", "valley of Jezreel"},
		{"Arabah", "Ataroth", "Atarothadar", "Arab", "Ar", "Adummim", "Beer", "Beeroth", "Bethhoglah", "Betharabah", "Bethel", "Bethaven", "Chephirah", "Enshemesh", "Enrogel", "Gibeon", "Israel", "Irpeel", "Jerusalem", "Jordan", "Jericho", "Kirjathjearim", "Luz", "Mizpeh", "Mozah", "Nephtoah", "Ophni", "Ophrah", "Rama", "Ramah", "Rekem", "salt sea", "Shiloh", "Taralah", "valley of Hinnom", "Zemaraim"},
		{"Achzib", "Ain", "Amad", "Aznothtabor", "Anaharath", "Adamah", "Ashan", "Achshaph", "Aphek", "Beersheba", "Bethlebaoth", "Bethdagon", "Beer", "Beneberak", "Bethemek", "Bethpazzez", "Bethlehem", "Beten", "Bethanath", "Bethul", "Baalathbeer", "Balah", "Baalath", "Bethshemesh", "Carmel", "Chesulloth", "Cabul", "Chinnereth", "Daberath", "Dan", "Edrei", "Ether", "Ephraim", "Eltolad", "Engannim", "Eshtaol", "Elon", "Ekron", "Enhaddah", "Eltekeh", "Enhazor", "Gathrimmon", "Gibbethon", "Gath", "Horem", "Hazor", "Hannathon", "Hammath", "Hebron", "Hali", "Heleph", "Helkath", "Hosah", "Hazarshual", "Hormah", "Hazarsusah", "Hukkok", "Israel", "Idalah", "Japhia", "Jokneam", "Jabneel", "Jehud", "Jezreel", "Jordan", "Kanah", "Kishion", "Kedesh", "Moladah", "Mejarkon", "Migdalel", "Neiel", "Rehob", "Remeth", "Rakkon", "Rabbith", "Shihorlibnath", "Shiloh", "Shimron", "Sharuhen", "Sheba", "Shunem", "Sarid", "Tabor", "Tyre", "Ummah", "Ziddim", "Zaanan", "Zer", "Zorah", "Zaanannim", "Ziklag"},
		{"Bashan", "Bezer", "Ephraim", "Golan", "Gilead", "Galilee", "Hebron", "Israel", "Jordan", "Jericho", "Kedesh", "Kirjatharba", "Ramoth", "Shechem"},
		{"Aijalon", "Anathoth", "Ain", "Abdon", "Bashan", "Bezer", "Bethshemesh", "Canaan", "Dimnah", "Debir", "Dan", "Ephraim", "Engannim", "Eltekeh", "Golan", "Gezer", "Gilead", "Gathrimmon", "Gibeon", "Gibbethon", "Galilee", "Geba", "Gath", "Hebron", "Heshbon", "Helkath", "Holon", "Israel", "Jokneam", "Jazer", "Juttah", "Jattir", "Jarmuth", "Jahaz", "Kibzaim", "Kartan", "Kedemoth", "Kishon", "Kedesh", "Libnah", "Mephaath", "Mishal", "Mahanaim", "Rehob", "Ramoth", "Shechem", "Shiloh"},
		{"Bashan", "Canaan", "Gilead", "Israel", "Jordan", "Peor", "Shiloh"},
		{"great sea", "Israel", "Jordan"},
		{"Canaan", "Egypt", "Ephraim", "Esau", "Gaash", "Israel", "Jordan", "Jericho", "mount Seir", "Moab", "Red sea", "Shechem", "wilderness"}
	};

	private static final String[][] Judges = {
		{"Aijalon", "Akrabbim", "Achzib", "Arad", "Ar", "Ahlab", "Bezek", "Bethanath", "Bethel", "Bethshemesh", "Canaan", "Debir", "Dor", "Dan", "Ephraim", "Ekron", "Gezer", "Gaza", "Helbah", "Heres", "Hebron", "Hormah", "Israel", "Ibleam", "Jerusalem", "Kitron", "Kirjatharba", "Luz", "Megiddo", "Nahalol", "Rehob", "Shaalbim", "Taanach", "the wilderness", "Zephath"},
		{"Ashtaroth", "Egypt", "Ephraim", "Gilgal", "Gaash", "Israel", "Timnathheres"},
		{"Ammon", "Amalek", "Canaan", "Ephraim", "Eglon", "Gilgal", "Hamath", "Israel", "Jordan", "Lebanon", "Moab", "Mesopotamia", "mount Lebanon", "Sidon"},
		{"Bethel", "Canaan", "Ephraim", "Hazor", "Israel", "Kishon", "Kedesh", "mount Tabor"},
		{"Amalek", "Canaan", "Dan", "Ephraim", "Edom", "Gilead", "Israel", "Jordan", "Kishon", "Meroz", "Megiddo", "Sinai", "Seir", "Taanach"},
		{"Amalek", "Egypt", "Gaza", "Israel", "Midian", "Ophrah", "valley of Jezreel"},
		{"Abelmeholah", "Amalek", "Bethshittah", "Ephraim", "Gilead", "Harod", "Israel", "Jordan", "Moreh", "Midian", "Tabbath"},
		{"Ephraim", "Israel", "Jordan", "Jogbehah", "Karkor", "Midian", "Nob", "Nobah", "Ophrah", "Penuel", "Shechem", "Succoth", "Tabor", "wilderness"},
		{"Arumah", "Beer", "Israel", "Lebanon", "Midian", "mount Gerizim", "Millo", "Ophrah", "Shechem", "Thebez"},
		{"Ammon", "Amalek", "Ashtaroth", "Egypt", "Ephraim", "Gilead", "Havothjair", "Israel", "Jordan", "Maon", "Moab", "Mizpeh", "Syria", "Shamir"},
		{"Aroer", "Ammon", "Arnon", "Egypt", "Edom", "Gilead", "Heshbon", "Israel", "Jabbok", "Jordan", "Jahaz", "Kadesh", "Minnith", "Minni", "Moab", "Mizpeh", "Red sea", "Tob", "wilderness"},
		{"Aijalon", "Ammon", "Amalek", "Ar", "Bethlehem", "Ephraim", "Gilead", "Israel", "Jordan", "Pirathon"},
		{"Dan", "Eshtaol", "Israel", "Zorah"},
		{"Ashkelon", "Israel", "Timnath"},
		{"Etam", "Enhakkore", "Israel", "Lehi", "Ramathlehi"},
		{"Eshtaol", "Gaza", "Hebron", "Israel", "valley of Sorek", "Zorah"},
		{"Bethlehemjudah", "Ephraim", "Israel"},
		{"Bethrehob", "Dan", "Ephraim", "Eshtaol", "Israel", "Mahanehdan", "Shiloh", "Zorah"},
		{"Bethlehemjudah", "Egypt", "Ephraim", "Gibeah", "Israel", "Jerusalem", "Rama", "Ramah"},
		{"Beersheba", "Beer", "Baaltamar", "Dan", "Gidom", "Gilead", "Gibeah", "Israel", "Mizpeh", "Rimmon", "the wilderness"},
		{"Bethel", "Canaan", "Israel", "Jabeshgilead", "Lebonah", "Mizpeh", "Rimmon", "Shechem", "Shiloh"}
	};

	private static final String[][] Ruth = {
		{"Bethlehem", "Bethlehemjudah", "Ephrath", "Moab"},
		{"Bethlehem", "Israel", "Moab"},
		{null},
		{"Bethlehem", "Israel", "Moab"}
	};

	private static final String[][] First_Samuel = {
		{"Ephraim", "Ephrath", "Israel", "Rama", "Ramah", "Shiloh"},
		{"Egypt", "Israel", "Rama", "Ramah", "Shiloh"},
		{"Beersheba", "Beer", "Dan", "Israel", "Shiloh"},
		{"Aphek", "Egypt", "Ebenezer", "Israel", "Shiloh", "wilderness"},
		{"Ashdod", "Ebenezer", "Ekron", "Gath", "Israel"},
		{"Ashdod", "Askelon", "Bethshemesh", "Egypt", "Ekron", "Gaza", "Gath", "Israel", "Kirjathjearim"},
		{"Ashtaroth", "Bethcar", "Bethel", "Ebenezer", "Ekron", "Gilgal", "Gath", "Israel", "Kirjathjearim", "Mizpeh", "Rama", "Ramah", "Shen"},
		{"Beersheba", "Beer", "Egypt", "Israel", "Rama", "Ramah"},
		{"Ephraim", "Israel", "Zuph"},
		{"Bethel", "Egypt", "Gilgal", "Gibeah", "Israel", "Mizpeh", "Tabor", "Zelzah"},
		{"Ammon", "Bezek", "Gilgal", "Gibeah", "Israel", "Jabeshgilead"},
		{"Ammon", "Ashtaroth", "Egypt", "Hazor", "Israel", "Moab"},
		{"Bethel", "Bethaven", "Bethhoron", "Gilead", "Gilgal", "Gibeah", "Geba", "Israel", "Jordan", "Michmash", "Ophrah", "Shual", "valley of Zeboim", "the wilderness", "Zeboim"},
		{"Aijalon", "Ammon", "Amalek", "Bozez", "Bethaven", "Ephraim", "Edom", "Gibeah", "Israel", "Michmash", "Moab", "Migron", "Seneh", "Shiloh", "Zobah"},
		{"Amalek", "Carmel", "Egypt", "Gilgal", "Gibeah", "Havilah", "Israel", "Rama", "Ramah", "Shur", "Telaim"},
		{"Bethlehem", "Israel", "Rama", "Ramah"},
		{"Azekah", "Bethlehem", "Bethlehemjudah", "Ephrath", "Ephesdammim", "Ekron", "Gath", "Israel", "Jerusalem", "Shaaraim", "valley of Elah", "the wilderness"},
		{"Israel"},
		{"Israel", "Naioth", "Rama", "Ramah"},
		{"Bethlehem", "Israel", "Naioth", "Rama", "Ramah"},
		{"Edom", "Gath", "Nob", "valley of Elah"},
		{"Adullam", "Edom", "Gibeah", "Moab", "Mizpeh", "Nob", "Rama", "Ramah"},
		{"Engedi", "Hazazontamar", "Hazezontamar", "Gibeah", "Hachilah", "Israel", "Jeshimon", "Keilah", "Maon", "the wilderness", "Ziph"},
		{"Engedi", "Hazazontamar", "Hazezontamar", "Israel"},
		{"Carmel", "Gallim", "Israel", "Jezreel", "Maon", "Rama", "Ramah", "wilderness of Paran"},
		{"Gibeah", "Hachilah", "Israel", "Jeshimon", "Ziph"},
		{"Amalek", "Carmel", "Egypt", "Geshur", "Gath", "Israel", "Jezreel", "Shur", "Ziklag"},
		{"Amalek", "Endor", "Gilboa", "Israel", "Rama", "Ramah", "Shunem"},
		{"Aphek", "Israel", "Jezreel"},
		{"Aroer", "Amalek", "Besor", "Bethel", "Carmel", "Egypt", "Hebron", "Hormah", "Israel", "Jattir", "Jezreel", "Ramoth", "Siphmoth", "Ziklag"},
		{"Ashtaroth", "Bethshan", "Israel", "Jabeshgilead", "Jordan", "mount Gilboa"}
	};

	private static final String[][] Second_Samuel = {
		{"Amalek", "Gilboa", "Gath", "Israel", "mount Gilboa", "Ziklag"},
		{"Ammah", "Bethlehem", "Carmel", "Ephraim", "Giah", "Gilead", "Gibeon", "Hebron", "Helkath", "Helkathhazzurim", "Israel", "Jabeshgilead", "Jezreel", "Jordan", "Mahanaim"},
		{"Beersheba", "Beer", "Bahurim", "Carmel", "Dan", "Gibeon", "Geshur", "Hebron", "Israel", "Jezreel", "Maacah", "Sirah"},
		{"Beer", "Beeroth", "Gittaim", "Hebron", "Israel", "Jezreel", "Rimmon", "Ziklag"},
		{"Baalperazim", "Geba", "Hebron", "Israel", "Japhia", "Jerusalem", "Millo", "Rephaim", "Tyre", "valley of Rephaim"},
		{"Gibeah", "Israel", "Perezuzzah"},
		{"Egypt", "Israel"},
		{"Ammon", "Amalek", "Betah", "Damascus", "Euphrates", "Edom", "Hamath", "Israel", "Jerusalem", "Moab", "Rehob", "Syria", "Zobah"},
		{"Jerusalem", "Lod", "Lodebar"},
		{"Ammon", "Bethrehob", "Helam", "Israel", "Jerusalem", "Jordan", "Jericho", "Maacah", "Rehob", "Syria"},
		{"Ammon", "Israel", "Jerusalem", "Thebez"},
		{"Ammon", "Israel", "Jerusalem"},
		{"Baalhazor", "Ephraim", "Geshur", "Israel"},
		{"Geshur", "Israel", "Jerusalem", "Tamar", "Tekoah"},
		{"Giloh", "Geshur", "Gath", "Hebron", "Israel", "Jerusalem", "Kidron", "Syria", "wilderness"},
		{"Bahurim", "Israel", "Jerusalem", "wilderness"},
		{"Ammon", "Beersheba", "Beer", "Bahurim", "Dan", "Enrogel", "Gilead", "Israel", "Jerusalem", "Jordan", "Lodebar", "Mahanaim", "Rogelim", "wilderness"},
		{"Ephraim", "Israel", "king\'s dale"},
		{"Bahurim", "Gilead", "Gilgal", "Israel", "Jerusalem", "Jordan", "Mahanaim", "Rogelim"},
		{"Ephraim", "Gibeon", "Israel", "Jerusalem", "Jair", "Jordan"},
		{"Bethshan", "Bethlehem", "Gilboa", "Gibeon", "Gibeah", "Gath", "Israel", "Jabeshgilead"},
		{null},
		{"Ammon", "Adullam", "Beer", "Beeroth", "Bethlehem", "Carmel", "Egypt", "Gareb", "Gibeah", "Gaash", "Hara", "Harod", "Israel", "Kabzeel", "Moab", "Pirathon", "Rephaim", "valley of Rephaim", "Zobah"},
		{"Aroer", "Beersheba", "Beer", "Canaan", "Dan", "Gilead", "Israel", "Jerusalem", "Jazer", "Jordan", "Tyre"}
	};

	private static final String[][] First_Kings = {
		{"Enrogel", "Gihon", "Israel"},
		{"Anathoth", "Bahurim", "Gilead", "Gath", "Hebron", "Israel", "Jerusalem", "Jordan", "Kidron", "Mahanaim", "Shiloh"},
		{"Egypt", "Gibeon", "Israel", "Jerusalem"},
		{"Abelmeholah", "Argob", "Beersheba", "Beer", "Bashan", "Bethshemesh", "Dor", "Dan", "Egypt", "Ephraim", "Elon", "Elonbethhanan", "Gilead", "Hepher", "Israel", "Jokneam", "Jair", "Jezreel", "Lebanon", "Megiddo", "Mahanaim", "Makaz", "Ramoth", "Ramothgilead", "Shaalbim", "Tiphsah", "Taanach"},
		{"Israel", "Lebanon", "Sidon", "Tyre"},
		{"Egypt", "Israel", "temple"},
		{"Jordan", "Lebanon", "plain of Jordan", "Succoth", "temple", "Tyre"},
		{"river of Egypt", "Egypt", "Hamath", "Horeb", "Israel", "Jerusalem"},
		{"Baalath", "Canaan", "Cabul", "Egypt", "Edom", "Gezer", "Gibeon", "Galilee", "Hazor", "Israel", "Jerusalem", "Lebanon", "Megiddo", "Millo", "Ophir", "Red sea", "Tadmor", "Tyre"},
		{"Arabia", "Egypt", "Israel", "Jerusalem", "Lebanon", "Ophir", "Syria", "Sheba"},
		{"Ammon", "Damascus", "Egypt", "Ephrath", "Edom", "Israel", "Jerusalem", "Moab", "Midian", "Millo", "Syria", "Zobah"},
		{"Bethel", "Dan", "Egypt", "Ephraim", "Israel", "Jerusalem", "Penuel", "Shechem"},
		{"Bethel", "Samaria"},
		{"Ammon", "Egypt", "Israel", "Jerusalem", "Naamah", "Rehob", "Shiloh", "Tirzah"},
		{"Damascus", "Dan", "Gibbethon", "Geba", "Israel", "Ijon", "Jerusalem", "Kidron", "Mizpah", "Rama", "Ramah", "Syria", "Tirzah"},
		{"Bethel", "Gibbethon", "Israel", "Jericho", "Samaria", "Tirzah"},
		{"Cherith", "Gilead", "Israel", "Jordan", "Zarephath"},
		{"Carmel", "Israel", "Jezreel", "Kishon", "mount Carmel", "Samaria"},
		{"Abelmeholah", "Beersheba", "Beer", "Damascus", "Horeb", "Israel", "Syria"},
		{"Aphek", "Damascus", "Israel", "Syria", "Samaria"},
		{"Israel", "Jezreel", "Samaria"},
		{"Edom", "Gilead", "Israel", "Jerusalem", "Ophir", "Ramoth", "Ramothgilead", "Syria", "Samaria"}
	};

	private static final String[][] Second_Kings = {
		{"Ekron", "Israel", "Moab", "Samaria"},
		{"Bethel", "Carmel", "Gilgal", "Israel", "Jordan", "Jericho", "mount Carmel", "Samaria"},
		{"Edom", "Israel", "Moab", "Samaria", "wilderness"},
		{"Gilgal", "mount Carmel", "Shunem"},
		{"Abana", "Damascus", "Ephraim", "Israel", "Jordan", "Pharpar", "Rimmon", "Syria", "Samaria"},
		{"Dothan", "Israel", "Jordan", "Syria", "Samaria"},
		{"Egypt", "Israel", "Jordan", "Syria", "Samaria"},
		{"Damascus", "Edom", "Israel", "Jerusalem", "Jezreel", "Libnah", "Rama", "Ramah", "Ramoth", "Ramothgilead", "Syria"},
		{"Gur", "Israel", "Ibleam", "Jerusalem", "Jezreel", "Megiddo", "Ramoth", "Ramothgilead", "Syria"},
		{"Aroer", "Arnon", "Bashan", "Bethel", "Dan", "Gilead", "Israel", "Jezreel", "Jordan", "Samaria"},
		{"Sur", "temple"},
		{"Beersheba", "Beer", "Gath", "Jerusalem", "Millo", "Syria", "Silla"},
		{"Aphek", "Israel", "Moab", "Syria", "Samaria"},
		{"Bethshemesh", "Damascus", "Ephraim", "Elath", "Edom", "Gathhepher", "Gath", "Hamath", "Israel", "Jerusalem", "Joktheel", "Lebanon", "Lachish", "Samaria"},
		{"Assyria", "Argob", "Gilead", "Galilee", "Hazor", "Israel", "Ijon", "Jerusalem", "Janoah", "Kedesh", "Syria", "Samaria", "Tiphsah", "Tirzah"},
		{"Assyria", "Damascus", "Elath", "Israel", "Jerusalem", "Syria"},
		{"Assyria", "Babylon", "Bethel", "Egypt", "Gozan", "Hamath", "Halah", "Habor", "Israel", "Samaria", "Sepharvaim", "Sephar"},
		{"Assyria", "Arpad", "Egypt", "Gozan", "Gaza", "Hamath", "Halah", "Hena", "Habor", "Israel", "Jerusalem", "Lachish", "Syria", "Samaria", "Sepharvaim", "Sephar", "temple"},
		{"Assyria", "Arpad", "Carmel", "Ethiopia", "Gozan", "Hara", "Hamath", "Haran", "Hena", "Israel", "Jerusalem", "Libnah", "Lebanon", "Lachish", "mount Zion", "Nineveh", "Rezeph", "Sepharvaim", "Sephar"},
		{"Assyria", "Babylon"},
		{"Egypt", "Israel", "Jerusalem", "Jotbah", "Samaria", "Uzza"},
		{"Israel", "Jerusalem"},
		{"Ammon", "Assyria", "Beersheba", "Beer", "Bethel", "Egypt", "Euphrates", "Geba", "Hamath", "Israel", "Jerusalem", "Kidron", "Libnah", "Megiddo", "Moab", "Riblah", "Samaria", "temple"},
		{"Ammon", "river of Egypt", "Babylon", "Egypt", "Euphrates", "Israel", "Jerusalem", "Libnah", "Moab", "Syria", "temple"},
		{"Babylon", "Egypt", "Hamath", "Jerusalem", "Jericho", "Mizpah", "Riblah"}
	};

	private static final String[][] First_Chronicles = {
		{null},
		{null},
		{"Hebron", "Jerusalem"},
		{"Ain", "Amalek", "Ashan", "Beersheba", "Bethuel", "Beer", "Bilhah", "Bethlehem", "Ezem", "Etam", "Gedor", "Hepher", "Hazarsusim", "Hazarshual", "Hormah", "Israel", "Jehud", "Jezreel", "Jabez", "Keilah", "Mareshah", "mount Seir", "Moab", "Moladah", "Ophrah", "Penuel", "Rimmon", "Shaaraim", "Seir", "Tochen", "Tekoa", "Tolad", "Zanoah", "Ziph", "Ziklag"},
		{"Aroer", "Assyria", "Baalmeon", "Bashan", "Buz", "Bela", "Euphrates", "Gozan", "Gilead", "Gog", "Hara", "Halah", "Habor", "Israel", "Jetur", "mount Hermon", "Nebo", "Nodab", "Pul", "Sheba", "wilderness"},
		{"Aijalon", "Anathoth", "Alemeth", "Abdon", "Ashan", "Ashtaroth", "Bashan", "Bezer", "Bethshemesh", "Debir", "Daberath", "Ephraim", "Golan", "Gezer", "Gilead", "Gathrimmon", "Galilee", "Geba", "Gath", "Hebron", "Heshbon", "Ham", "Israel", "Jerusalem", "Jazer", "Jattir", "Jordan", "Jericho", "Kedemoth", "Kedesh", "Libnah", "Mephaath", "Mahanaim", "Mashal", "Rehob", "Ramoth", "Rimmon", "Shechem", "temple", "Tabor", "Uzza", "wilderness", "Zuph"},
		{"Anathoth", "Aram", "Bered", "Bilhah", "Bela", "Bezer", "Bethel", "Dor", "Ephraim", "Gezer", "Gilead", "Gaza", "Gath", "Israel", "Megiddo", "Naaran", "Shechem", "Shual", "Tahath", "Taanach"},
		{"Aijalon", "Addar", "Arad", "Alemeth", "Abdon", "Bela", "Elam", "Gedor", "Gibeon", "Geba", "Gath", "Jerusalem", "Lod", "Mesha", "Moab", "Manahath", "Ono", "Penuel", "Shema", "Uzza"},
		{"Abdon", "Babylon", "Ephraim", "Gedor", "Gibeon", "Israel", "Immer", "Jerusalem", "Zimri"},
		{"Israel", "Jabeshgilead", "mount Gilboa", "temple"},
		{"Aroer", "Ammon", "Adullam", "Baharum", "Bethlehem", "Carmel", "Egypt", "Gareb", "Gibeah", "Gaash", "Hara", "Hebron", "Hepher", "Israel", "Jerusalem", "Kabzeel", "Moab", "Millo", "Pirathon", "Rephaim", "valley of Rephaim"},
		{"Dan", "Ephraim", "Gedor", "Gibeon", "Hebron", "Israel", "Jordan", "wilderness", "Ziklag"},
		{"Baalah", "Egypt", "Israel", "Kirjathjearim", "Perezuzza"},
		{"Baalperazim", "Gibeon", "Israel", "Jerusalem", "Rephaim", "Tyre", "valley of Rephaim"},
		{"Hebron", "Israel", "Jerusalem"},
		{"Canaan", "Gibeon", "Israel"},
		{"Egypt", "Israel"},
		{"Ammon", "Amalek", "Damascus", "Euphrates", "Edom", "Gath", "Hamath", "Israel", "Jerusalem", "Moab", "Syria", "Tibhath", "Zobah"},
		{"Ammon", "Israel", "Jerusalem", "Jordan", "Jericho", "Mesopotamia", "Medeba", "Syria", "Zobah"},
		{"Ammon", "Gezer", "Gath", "Israel", "Jerusalem"},
		{"Beersheba", "Beer", "Dan", "Gibeon", "Israel", "Jerusalem", "wilderness"},
		{"Israel", "Tyre"},
		{"Hebron", "Israel", "Jerusalem"},
		{"Israel"},
		{null},
		{"Gilead", "Hebron", "Israel", "Jordan", "Shallecheth"},
		{"Dan", "Ephraim", "Gilead", "Israel", "Pirathon", "Rama", "Ramah"},
		{"Israel", "Jerusalem"},
		{"Hebron", "Israel", "Jerusalem", "Ophir"}
	};

	private static final String[][] Second_Chronicles = {
		{"Egypt", "Gibeon", "Israel", "Jerusalem", "Syria", "wilderness"},
		{"Dan", "Israel", "Jerusalem", "Joppa", "Lebanon", "Tyre"},
		{"Jerusalem", "Moriah", "temple"},
		{"plain of Jordan", "Succoth", "temple"},
		{"Egypt", "Horeb", "Israel", "Jerusalem"},
		{"Egypt", "Israel", "Jerusalem"},
		{"river of Egypt", "Egypt", "Hamath", "Israel"},
		{"Baalath", "Edom", "Hamath", "Israel", "Jerusalem", "Lebanon", "Ophir", "Tadmor"},
		{"Arabia", "Egypt", "Israel", "Jerusalem", "Lebanon", "Ophir", "Sheba", "Tarshish"},
		{"Egypt", "Israel", "Jerusalem", "Shechem"},
		{"Aijalon", "Adullam", "Adoraim", "Azekah", "Bethzur", "Bethlehem", "Etam", "Gath", "Hebron", "Israel", "Jerusalem", "Lachish", "Mareshah", "Tekoa", "Ziph", "Zorah"},
		{"Ammon", "Egypt", "Ethiopia", "Israel", "Jerusalem"},
		{"Bethel", "Ephraim", "Gibeah", "Israel", "Jerusalem", "Jeshanah", "Zemaraim"},
		{"Ethiopia", "Gerar", "Jerusalem", "Mareshah", "valley of Zephathah"},
		{"Ephraim", "Israel", "Jerusalem", "Kidron"},
		{"Damascus", "Dan", "Ethiopia", "Geba", "Israel", "Ijon", "Mizpah", "Rama", "Ramah", "Syria"},
		{"Arabia", "Ephraim", "Israel", "Jerusalem"},
		{"Israel", "Ramothgilead", "Syria", "Samaria"},
		{"Beersheba", "Ephraim", "Israel", "Jerusalem"},
		{"Ammon", "Egypt", "Eziongaber", "Engedi", "Hazazontamar", "Hazezontamar", "Israel", "Jerusalem", "Jeruel", "Mareshah", "mount Seir", "Moab", "Syria", "Seir", "Tekoa", "Tarshish", "Ziz"},
		{"Arabia", "Ethiopia", "Edom", "Israel", "Jerusalem", "Libnah"},
		{"Arabia", "Israel", "Jerusalem", "Jezreel", "Rama", "Ramah", "Ramothgilead", "Syria", "Samaria"},
		{"Israel", "Jerusalem", "temple"},
		{"Ammon", "Beersheba", "Beer", "Damascus", "Israel", "Jerusalem", "Moab", "Syria", "wilderness"},
		{"Bethshemesh", "Ephraim", "Edom", "Israel", "Jerusalem", "Lebanon", "Lachish", "Samaria", "Seir"},
		{"Ammon", "Arabia", "Ashdod", "Carmel", "Egypt", "Gurbaal", "Gath", "Jerusalem", "temple"},
		{"Ammon", "Israel", "Jerusalem", "Ophel", "temple"},
		{"Assyria", "Bethshemesh", "Damascus", "Ephraim", "Edom", "Gederoth", "Gimzo", "Israel", "Jerusalem", "Jericho", "Syria", "Samaria", "Timnah"},
		{"Israel", "Jerusalem", "Kidron", "temple"},
		{"Assyria", "Beersheba", "Dan", "Ephraim", "Israel", "Jerusalem", "Kidron"},
		{"Ephraim", "Israel", "Jerusalem"},
		{"Assyria", "Babylon", "Gihon", "Israel", "Jerusalem", "Lachish", "Millo"},
		{"Assyria", "Babylon", "Gihon", "Israel", "Jerusalem", "Ophel"},
		{"Ephraim", "Israel", "Jerusalem"},
		{"Egypt", "Euphrates", "Israel", "Jerusalem", "Megiddo", "temple"},
		{"Babylon", "Egypt", "Israel", "Jerusalem", "Persia", "temple"}
	};

	private static final String[][] Ezra = {
		{"Babylon", "Israel", "Jerusalem", "Persia"},
		{"Ai", "Anathoth", "Beeroth", "Bethlehem", "Babylon", "Bethel", "Chephirah", "Cherub", "Elam", "Gilead", "Hadid", "Israel", "Immer", "Jerusalem", "Jericho", "Lod", "Netophah", "Nebo", "Ono", "Rama", "Ramah", "Telmelah", "Uzza"},
		{"Israel", "Jerusalem", "Joppa", "Lebanon", "Persia", "temple", "Tyre", "Zidon"},
		{"Babylon", "Elam", "Israel", "Jerusalem", "Persia", "Syria", "Samaria", "Susa", "temple"},
		{"Babylon", "Chaldea", "Israel", "Jerusalem", "temple"},
		{"Assyria", "Babylon", "Israel", "Jerusalem", "Persia", "temple"},
		{"Babylon", "Israel", "Jerusalem", "Persia"},
		{"Ahava", "Babylon", "Casiphia", "Elam", "Israel", "Jerusalem", "Jeshua"},
		{"Ammon", "Canaan", "Egypt", "Israel", "Jerusalem", "Moab", "Persia"},
		{"Israel", "Jerusalem"}
	};

	private static final String[][] Nehemiah = {
		{"Israel", "Jerusalem"},
		{"Ammon", "Arabia", "Israel", "Jerusalem"},
		{"Bethzur", "Gibeon", "Immer", "Jerusalem", "Jericho", "Jeshua", "Keilah", "Mizpah", "Ophel", "Zanoah"},
		{"Ammon", "Arabia", "Ashdod", "Jerusalem", "Samaria"},
		{null},
		{"Arabia", "Jerusalem", "Ono", "temple"},
		{"Ai", "Anathoth", "Beeroth", "Bethlehem", "Babylon", "Bethel", "Bethazmaveth", "Chephirah", "Cherub", "Gilead", "Gibeon", "Hadid", "Israel", "Immer", "Jerusalem", "Jericho", "Kirjathjearim", "Lod", "Netophah", "Nebo", "Ono", "Rama", "Ramah", "Telmelah", "Uzza"},
		{"Ephraim", "Israel", "Jerusalem"},
		{"Assyria", "Bashan", "Canaan", "Egypt", "Heshbon", "Israel", "mount Sinai", "Red sea", "Ur of the Chaldees", "wilderness"},
		{"Israel"},
		{"Anathoth", "Ananiah", "Adullam", "Azekah", "Beersheba", "Beer", "Bethel", "Dibon", "Geba", "Gittaim", "Hazor", "Hadid", "Hazarshual", "Israel", "Jerusalem", "Jarmuth", "Jekabzeel", "Jeshua", "Kirjatharba", "Lod", "Lachish", "Michmash", "Moladah", "Nob", "Neballat", "Ophel", "Ono", "Rama", "Ramah", "valley of Hinnom", "Zanoah", "Zeboim", "Ziklag"},
		{"Ephraim", "Elam", "Gilgal", "Geba", "Israel", "Jerusalem", "Persia"},
		{"Ammon", "Ashdod", "Babylon", "Israel", "Jerusalem", "Moab", "Tyre"}
	};

	private static final String[][] Esther = {
		{"Ethiopia", "India", "Media", "Persia", "Tarshish"},
		{"Babylon", "Jerusalem"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Ethiopia", "India"},
		{null},
		{"Media", "Persia"}
	};

	private static final String[][] Job = {
		{"Chaldea", "Uz"},
		{"Tema"},
		{null},
		{"Tema"},
		{null},
		{"Sheba", "Tema"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Tema"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Ophir", "Tema"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Ethiopia", "Ophir"},
		{null},
		{null},
		{null},
		{"Buz"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Jordan"},
		{null},
		{"Tema"},
	};

	private static final String[][] Psalms = {
		{null},
		{null},
		{null},
		{null},
		{"temple"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"temple"},
		{null},
		{null},
		{"Israel"},
		{null},
		{null},
		{null},
		{"temple"},
		{null},
		{null},
		{null},
		{"Bashan", "Israel"},
		{null},
		{null},
		{"Israel"},
		{null},
		{"temple"},
		{null},
		{"Kadesh", "Lebanon", "temple"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Israel"},
		{"Jordan"},
		{null},
		{null},
		{"Ophir", "Tyre"},
		{null},
		{null},
		{"mount Zion", "temple", "Tarshish"},
		{null},
		{"Israel"},
		{"Jerusalem", "Zion"},
		{null},
		{"Israel"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Israel"},
		{"Ephraim", "Edom", "Gilead", "Moab", "Philistia", "Shechem", "Succoth"},
		{null},
		{null},
		{null},
		{null},
		{"Sion", "temple"},
		{null},
		{null},
		{"Bashan", "Egypt", "Ethiopia", "Israel", "Jerusalem", "Sinai", "temple"},
		{"Israel"},
		{null},
		{"Israel"},
		{"Israel", "Lebanon", "Seba", "Sheba", "Tarshish"},
		{"Israel"},
		{"mount Zion"},
		{null},
		{"Israel", "Salem"},
		{null},
		{"Egypt", "Ephraim", "Ham", "Israel", "mount Zion", "Shiloh", "Zoan"},
		{"Jerusalem", "temple"},
		{"Egypt", "Ephraim", "Israel"},
		{"Egypt", "Israel", "Meribah"},
		{null},
		{"Ammon", "Amalek", "Endor", "Edom", "Gebal", "Israel", "Moab", "Midian", "Tyre"},
		{null},
		{null},
		{null},
		{"Babylon", "Ethiopia", "Philistia", "Rahab", "Tyre", "Zion"},
		{null},
		{"Israel", "Rahab", "Tabor"},
		{null},
		{null},
		{"Lebanon"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Israel"},
		{null},
		{null},
		{null},
		{"Jerusalem"},
		{"Israel"},
		{"Lebanon"},
		{"Canaan", "Egypt", "Ham", "Israel"},
		{"Baalpeor", "Canaan", "Egypt", "Horeb", "Ham", "Israel", "Red sea"},
		{null},
		{"Ephraim", "Edom", "Gilead", "Moab", "Philistia", "Shechem", "Succoth"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Egypt", "Israel", "Jordan"},
		{"Israel"},
		{"Jerusalem"},
		{null},
		{"Israel"},
		{null},
		{"Kedar"},
		{"Israel"},
		{"Israel", "Jerusalem"},
		{null},
		{"Israel"},
		{"Israel", "Jerusalem", "mount Zion"},
		{null},
		{null},
		{"Israel", "Jerusalem"},
		{"Israel"},
		{"Israel"},
		{"Israel"},
		{null},
		{null},
		{null},
		{"Bashan", "Canaan", "Egypt", "Israel", "Jerusalem"},
		{"Bashan", "Egypt", "Israel", "Red sea"},
		{"Babylon", "Edom", "Jerusalem"},
		{"temple"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Israel", "Jerusalem"},
		{"Israel"},
		{"Israel"},
		{null}
	};

	private static final String[][] Proverbs = {
		{"Israel"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Egypt"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
	};

	private static final String[][] Ecclesiasties = {
		{"Israel", "Jerusalem"},
		{"Jerusalem"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
	};

	private static final String[][] Song_of_Solomon = {
		{"Engedi", "Hazazontamar", "Hazezontamar", "Jerusalem", "Kedar"},
		{"Jerusalem"},
		{"Israel", "Jerusalem", "Lebanon"},
		{"Amana", "Gilead", "Lebanon"},
		{"Jerusalem", "Lebanon"},
		{"Gilead", "Jerusalem", "Tirzah"},
		{"Bathrabbim", "Carmel", "Damascus", "Heshbon", "Lebanon"},
		{"Jerusalem"}
	};

	private static final String[][] Isaiah = {
		{"Gomorrah", "Israel", "Jerusalem", "Sodom"},
		{"Bashan", "Jerusalem", "Lebanon", "Tarshish"},
		{"Jerusalem", "Sodom"},
		{"Israel", "Jerusalem", "mount Zion"},
		{"Israel", "Jerusalem"},
		{null},
		{"Assyria", "Damascus", "Egypt", "Ephraim", "Israel", "Jerusalem", "Syria", "Samaria"},
		{"Assyria", "Damascus", "Israel", "Jerusalem", "mount Zion", "Samaria", "Shiloah"},
		{"Ephraim", "Galilee", "Israel", "Jordan", "Midian", "Syria", "Samaria"},
		{"Anathoth", "Assyria", "Arpad", "Carchemish", "Damascus", "Egypt", "Gallim", "Gebim", "Gibeah", "Geba", "Hamath", "Israel", "Jerusalem", "Lebanon", "Michmash", "Midian", "Madmenah", "Migron", "mount Zion", "Nob", "Rama", "Ramah", "Samaria"},
		{"Ammon", "Assyria", "Cush", "Egypt", "Ephraim", "Edom", "Elam", "Hamath", "Israel", "Moab", "Pathros", "Shinar", "Zion"},
		{"Israel"},
		{"Arabia", "Babylon", "Gomorrah", "Ophir", "Sodom"},
		{"Assyria", "Babylon", "Israel", "Lebanon", "Palestina"},
		{"Beerelim", "Dibon", "Elealeh", "Eglaim", "Heshbon", "Horonaim", "Jahaz", "Luhith", "Moab", "Medeba", "Nimrim", "Nebo", "Zoar"},
		{"Arnon", "Elealeh", "Heshbon", "Jazer", "Moab", "Sela", "wilderness"},
		{"Aroer", "Damascus", "Ephraim", "Israel", "Syria", "valley of Rephaim"},
		{"Ethiopia", "mount Zion"},
		{"Assyria", "Canaan", "Egypt", "Israel", "Zoan"},
		{"Assyria", "Ashdod", "Egypt", "Ethiopia"},
		{"Arabia", "Babylon", "Dedan", "Dumah", "Elam", "Israel", "Kedar", "Media", "Seir", "Tema"},
		{"Elam", "Jerusalem"},
		{"Assyria", "Chaldea", "Egypt", "Tarshish", "Tyre"},
		{"Israel", "Jerusalem", "mount Zion"},
		{"Moab"},
		{null},
		{"Assyria", "Egypt", "Israel", "Jerusalem"},
		{"Ephraim", "Jerusalem", "mount Perazim", "valley of Gibeon"},
		{"Israel", "Lebanon", "mount Zion"},
		{"Assyria", "Egypt", "Hanes", "Israel", "Jerusalem", "Zoan"},
		{"Assyria", "Egypt", "Israel", "Jerusalem", "mount Zion"},
		{null},
		{"Bashan", "Carmel", "Jerusalem", "Lebanon"},
		{"Bozrah"},
		{"Carmel", "Lebanon"},
		{"Assyria", "Egypt", "Hamath", "Jerusalem", "Lachish", "Syria", "Samaria", "Sepharvaim", "Sephar"},
		{"Assyria", "Carmel", "Ethiopia", "Gozan", "Hamath", "Haran", "Hena", "Israel", "Jerusalem", "Libnah", "Lebanon", "Lachish", "mount Zion", "Nineveh", "Rezeph", "Sepharvaim", "Sephar", "Telassar"},
		{"Assyria"},
		{"Babylon"},
		{"Israel", "Jerusalem", "Lebanon"},
		{"Israel", "Jerusalem"},
		{"Israel", "Kedar"},
		{"Babylon", "Chaldea", "Egypt", "Ethiopia", "Israel", "Seba", "wilderness"},
		{"Israel", "Jerusalem", "temple"},
		{"Egypt", "Ethiopia", "Israel"},
		{"Israel", "Nebo"},
		{"Babylon", "Chaldea", "Israel"},
		{"Babylon", "Chaldea", "Israel"},
		{"Israel"},
		{null},
		{"Eden", "garden", "Jerusalem"},
		{"Assyria", "Egypt", "Israel", "Jerusalem"},
		{null},
		{"Israel"},
		{"Israel"},
		{"Israel"},
		{null},
		{null},
		{null},
		{"Ephah", "Israel", "Kedar", "Lebanon", "Midian", "Nebaioth", "Sheba", "Tarshish"},
		{null},
		{"Jerusalem"},
		{"Bozrah", "Edom", "Israel"},
		{"Jerusalem"},
		{"Jerusalem", "valley of Achor"},
		{"Israel", "Jerusalem", "Javan", "Pul", "Tubal", "temple", "Tarshish"}
	};

	private static final String[][] Jeremiah = {
		{"Anathoth", "Jerusalem"},
		{"Assyria", "Egypt", "Israel", "Jerusalem", "Kedar"},
		{"Arabia", "Israel", "Jerusalem"},
		{"Dan", "Ephraim", "Israel", "Jerusalem"},
		{"Israel", "Jerusalem"},
		{"Israel", "Jerusalem", "Sheba", "Tekoa"},
		{"Egypt", "Ephraim", "Israel", "Jerusalem", "Shiloh", "temple"},
		{"Dan", "Gilead", "Jerusalem"},
		{"Ammon", "Egypt", "Edom", "Israel", "Jerusalem", "Moab"},
		{"Israel", "Tarshish", "Uphaz"},
		{"Anathoth", "Egypt", "Israel", "Jerusalem"},
		{"Israel", "Jordan"},
		{"Ethiopia", "Euphrates", "Israel", "Jerusalem"},
		{"Israel", "Jerusalem"},
		{"Jerusalem"},
		{"Egypt", "Israel"},
		{"Israel", "Jerusalem"},
		{"Israel", "Jerusalem", "Lebanon"},
		{"Israel", "Jerusalem"},
		{"Babylon", "Immer"},
		{"Babylon", "Chaldea", "Israel"},
		{"Bashan", "Babylon", "Chaldea", "Gilead", "Jerusalem", "Lebanon"},
		{"Egypt", "Gomorrah", "Israel", "Jerusalem", "Sodom", "Samaria"},
		{"Babylon", "Chaldea", "Egypt", "Israel", "Jerusalem", "temple"},
		{"Ammon", "Arabia", "Ashkelon", "Ashdod", "Buz", "Babylon", "Chaldea", "Dedan", "Egypt", "Ekron", "Edom", "Elam", "Israel", "Jerusalem", "Moab", "Tema", "Uz", "Zimri"},
		{"Egypt", "Jerusalem", "Shiloh"},
		{"Ammon", "Babylon", "Edom", "Israel", "Jerusalem", "Moab"},
		{"Babylon", "Gibeon", "Israel"},
		{"Anathoth", "Babylon", "Israel", "Jerusalem"},
		{"Israel"},
		{"Egypt", "Ephraim", "Gareb", "Israel", "Kidron", "Rama", "Ramah", "Samaria"},
		{"Anathoth", "Babylon", "Chaldea", "Egypt", "Israel", "Jerusalem"},
		{"Chaldea", "Israel", "Jerusalem"},
		{"Azekah", "Babylon", "Egypt", "Israel", "Jerusalem", "Lachish"},
		{"Babylon", "Chaldea", "Israel", "Jerusalem", "Syria"},
		{"Babylon", "Israel", "Jerusalem"},
		{"Babylon", "Chaldea", "Egypt", "Israel", "Jerusalem"},
		{"Babylon", "Chaldea", "Ethiopia", "Israel", "Jerusalem"},
		{"Babylon", "Chaldea", "Ethiopia", "Hamath", "Israel", "Jerusalem", "Jericho", "Riblah"},
		{"Ammon", "Babylon", "Chaldea", "Edom", "Jerusalem", "Moab", "Mizpah", "Rama", "Ramah"},
		{"Ammon", "Bethlehem", "Babylon", "Chaldea", "Egypt", "Gibeon", "Israel", "Mizpah", "Shechem", "Shiloh", "Samaria"},
		{"Babylon", "Egypt", "Israel", "Jerusalem"},
		{"Babylon", "Bethshemesh", "Chaldea", "Egypt", "Israel", "Tahpanhes"},
		{"Babylon", "Egypt", "Israel", "Jerusalem", "Migdol", "Pathros", "Tahpanhes"},
		{"Israel"},
		{"Babylon", "Carmel", "Carchemish", "Egypt", "Ethiopia", "Euphrates", "Gilead", "Israel", "Libya", "Migdol", "Tahpanhes", "Tabor"},
		{"Ashkelon", "Gaza"},
		{"Aroer", "Arnon", "Bethgamul", "Bozrah", "Bethel", "Dibon", "Elealeh", "Heshbon", "Horonaim", "Holon", "Israel", "Jahaz", "Kiriathaim", "Luhith", "Mephaath", "Moab", "Nimrim", "Nebo", "sea of Jazer", "Zoar"},
		{"Ai", "Ammon", "Arpad", "Bozrah", "Babylon", "Damascus", "Dedan", "Esau", "Edom", "Elam", "Gomorrah", "Hazor", "Hamath", "Heshbon", "Israel", "Jordan", "Kedar", "Red sea", "Sodom", "Teman", "Tema"},
		{"Assyria", "Bashan", "Babylon", "Carmel", "Chaldea", "Ephraim", "Gilead", "Gomorrah", "Israel", "Jordan", "Sodom", "temple"},
		{"Ararat", "Babylon", "Chaldea", "Euphrates", "Israel", "Jerusalem", "Minni", "temple"},
		{"Babylon", "Chaldea", "Hamath", "Jerusalem", "Jericho", "Libnah", "Riblah"}
	};

	private static final String[][] Lamentations = {
		{"Jerusalem"},
		{"Israel", "Jerusalem"},
		{null},
		{"Edom", "Jerusalem", "Sodom", "Uz", "Zion"},
		{"Assyria", "Egypt"}
	};

	private static final String[][] Ezekiel = {
		{"Chaldea", "Chebar"},
		{"Israel"},
		{"Chebar", "Israel", "Telabib"},
		{"Israel", "Jerusalem"},
		{"Israel", "Jerusalem"},
		{"Israel"},
		{"Israel"},
		{"Israel", "Jerusalem", "temple"},
		{"Israel", "Jerusalem"},
		{"Chebar", "Israel"},
		{"Chaldea", "Israel", "Jerusalem"},
		{"Babylon", "Chaldea", "Israel", "Jerusalem"},
		{"Israel", "Jerusalem"},
		{"Dan", "Israel", "Jerusalem"},
		{"Jerusalem"},
		{"Assyria", "Canaan", "Chaldea", "Egypt", "Jerusalem", "Sodom", "Syria", "Samaria"},
		{"Babylon", "Egypt", "Israel", "Jerusalem", "Lebanon"},
		{"Israel"},
		{"Babylon", "Egypt", "Israel"},
		{"Egypt", "Israel"},
		{"Ammon", "Babylon", "Israel", "Jerusalem"},
		{"Israel", "Jerusalem"},
		{"Assyria", "Babylon", "Chaldea", "Egypt", "Jerusalem", "Koa", "Shoa", "Samaria"},
		{"Babylon", "Israel", "Jerusalem"},
		{"Ammon", "Baalmeon", "Dedan", "Edom", "Israel", "Kiriathaim", "Moab", "Seir", "Teman"},
		{"Babylon", "Jerusalem"},
		{"Arabia", "Arvad", "Asshur", "Bashan", "Chilmad", "Damascus", "Dedan", "Dan", "Eden", "Egypt", "Geba", "Gebal", "Haran", "Helbon", "Israel", "Javan", "Kedar", "Lebanon", "Minnith", "Minni", "Meshech", "Persia", "Raamah", "Syria", "Sheba", "Tubal", "Tarshish", "Tyrus", "Zidon"},
		{"Eden", "Israel"},
		{"Babylon", "Egypt", "Ethiopia", "Israel", "Pathros", "Syene"},
		{"Babylon", "Egypt", "Ethiopia", "Libya", "Pathros", "Pibeseth", "Syene", "Zoan"},
		{"Assyria", "Eden", "Egypt", "Lebanon"},
		{"Asshur", "Babylon", "Egypt", "Edom", "Elam", "Meshech", "Tubal"},
		{"Israel", "Jerusalem"},
		{"Israel"},
		{"Israel", "mount Seir"},
		{"Eden", "Israel", "Jerusalem"},
		{"Ephraim", "Israel"},
		{"Dedan", "Ethiopia", "Gog", "Israel", "Libya", "Magog", "Meshech", "Persia", "Sheba", "Tubal", "Tarshish"},
		{"Bashan", "Gog", "Hamonah", "Israel", "Magog", "Meshech", "Tubal", "valley of Hamongog"},
		{"Israel"},
		{null},
		{null},
		{"Chebar", "Israel"},
		{"Israel"},
		{"Israel"},
		{null},
		{"Berothah", "Damascus", "Engedi", "Hazazontamar", "Hazezontamar", "Eneglaim", "Gilead", "great sea", "Hazarenan", "Hethlon", "Hamath", "Hauran", "Israel", "Jordan", "Kadesh", "Sibraim", "Tamar", "Zedad"},
		{"Damascus", "Dan", "Ephraim", "great sea", "Hazarenan", "Hethlon", "Hamath", "Israel", "Kadesh", "Tamar"}
	};

	private static final String[][] Daniel = {
		{"Babylon", "Chaldea", "Israel", "Jerusalem", "Mesha", "Shinar"},
		{"Babylon", "Chaldea", "Mesha", "Syria"},
		{"Babylon", "Chaldea", "Dura", "Mesha"},
		{"Babylon", "Chaldea"},
		{"Babylon", "Chaldea", "Jerusalem", "Media", "Persia"},
		{"Jerusalem", "Persia"},
		{"Babylon", "great sea"},
		{"Dan", "Elam", "Media", "Persia", "Ulai"},
		{"Chaldea", "Egypt", "Israel", "Jerusalem"},
		{"Dan", "Hiddekel", "Persia", "Uphaz"},
		{"Ammon", "Egypt", "Ethiopia", "Edom", "Libya", "Moab", "Persia"},
		{null}
	};

	private static final String[][] Hosea = {
		{"Israel", "Jezreel", "valley of Jezreel"},
		{"Egypt", "Jezreel", "valley of Achor"},
		{"Israel"},
		{"Bethaven", "Ephraim", "Gilgal", "Israel"},
		{"Assyria", "Bethaven", "Ephraim", "Gibeah", "Israel", "Mizpah", "Rama", "Ramah", "Tabor"},
		{"Ephraim", "Gilead", "Israel"},
		{"Assyria", "Egypt", "Ephraim", "Israel", "Samaria"},
		{"Assyria", "Egypt", "Ephraim", "Israel", "Samaria", "temple"},
		{"Assyria", "Baalpeor", "Egypt", "Ephraim", "Gilgal", "Gibeah", "Israel", "Memphis"},
		{"Assyria", "Betharbel", "Bethel", "Bethaven", "Ephraim", "Gibeah", "Israel", "Samaria"},
		{"Assyria", "Admah", "Egypt", "Ephraim", "Israel", "Zeboim"},
		{"Assyria", "Bethel", "Egypt", "Ephraim", "Gilead", "Gilgal", "Israel", "Syria"},
		{"Egypt", "Ephraim", "Israel", "Samaria"},
		{"Asshur", "Ephraim", "Israel", "Lebanon"}
	};

	private static final String[][] Joel = {
		{null},
		{"Eden", "Israel", "Jerusalem", "mount Zion"},
		{"Egypt", "Edom", "Israel", "Jerusalem", "temple", "Tyre", "valley of Shittim", "Zidon", "Zion"}
	};

	private static final String[][] Amos = {
		{"Ammon", "Ashkelon", "Ashdod", "Bozrah", "Carmel", "Damascus", "Ekron", "Edom", "Gilead", "Gaza", "Israel", "Jerusalem", "Syria", "Teman", "Tekoa"},
		{"Egypt", "Edom", "Israel", "Jerusalem", "Moab"},
		{"Ashdod", "Bethel", "Damascus", "Egypt", "Israel", "Samaria"},
		{"Bashan", "Bethel", "Egypt", "Gilgal", "Gomorrah", "Israel", "Sodom", "Samaria"},
		{"Beersheba", "Beer", "Bethel", "Damascus", "Gilgal", "Israel"},
		{"Calneh", "Gath", "Hamath", "Israel", "Samaria"},
		{"Bethel", "Israel"},
		{"Beersheba", "Dan", "Egypt", "Israel", "Samaria", "temple"},
		{"Carmel", "Egypt", "Ethiopia", "Edom", "Israel", "Syria"}
	};

	private static final String[][] Obadiah = {
		{"Canaan", "Ephraim", "Esau", "Edom", "Gilead", "Israel", "Jerusalem", "mount Zion", "Samaria", "Teman", "Tema", "Zarephath"}
	};

	private static final String[][] Jonah = {
		{"Joppa", "Nineveh", "Tarshish"},
		{"temple"},
		{"Nineveh"},
		{"Nineveh", "Tarshish"}
	};

	private static final String[][] Micah = {
		{"Achzib", "Adullam", "Bethezel", "Gath", "Israel", "Jerusalem", "Lachish", "Mareshah", "Moreshethgath", "Maroth", "Moresheth", "Samaria", "temple", "Zaanan"},
		{"Bozrah", "Israel"},
		{"Israel", "Jerusalem"},
		{"Babylon", "Jerusalem", "mount Zion"},
		{"Assyria", "Bethlehem", "Israel", "Nimrod"},
		{"Egypt", "Gilgal", "Israel", "Moab", "Shittim"},
		{"Assyria", "Bashan", "Carmel", "Egypt", "Gilead"}
	};

	private static final String[][] Nahum = {
		{"Bashan", "Carmel", "Lebanon", "Nineveh"},
		{"Israel", "Nineveh"},
		{"Assyria", "Egypt", "Ethiopia", "Nineveh"}
	};

	private static final String[][] Habakkuk = {
		{"Chaldea"},
		{"Lebanon", "temple"},
		{"Cushan", "Midian", "mount Paran", "Teman"}
	};

	private static final String[][] Zephaniah = {
		{"Jerusalem"},
		{"Ammon", "Ashkelon", "Assyria", "Ashdod", "Canaan", "Ethiopia", "Ekron", "Gaza", "Gomorrah", "Israel", "Moab", "Nineveh", "Sodom"},
		{"Ethiopia", "Israel", "Jerusalem"}
	};

	private static final String[][] Haggai = {
		{null},
		{"Egypt", "temple"}
	};

	private static final String[][] Zechariah = {
		{"Israel", "Jerusalem"},
		{"Babylon", "Jerusalem"},
		{"Jerusalem"},
		{null},
		{"Shinar"},
		{"Babylon", "temple"},
		{"Jerusalem"},
		{"Israel", "Jerusalem", "temple"},
		{"Ashkelon", "Ashdod", "Damascus", "Ephraim", "Ekron", "Greece", "Gaza", "Hamath", "Hadrach", "Israel", "Jerusalem"},
		{"Assyria", "Egypt", "Ephraim", "Gilead", "Lebanon"},
		{"Bashan", "Israel", "Jordan", "Lebanon"},
		{"Hadadrimmon", "Israel", "Jerusalem", "Megiddo"},
		{"Jerusalem"},
		{"Azal", "Canaan", "Egypt", "Geba", "Jerusalem", "mount of Olives", "Rimmon"}
	};

	private static final String[][] Malachi = {
		{"Esau", "Edom", "Israel"},
		{"Israel", "Jerusalem"},
		{"Jerusalem", "temple"},
		{"Horeb", "Israel"}
	};

	/**
	 * New Testament books of the Bible.
	 */

	private static final String[][] Matthew = {
		{"Babylon"},
		{"Bethlehem", "Judaea", "Jerusalem", "Israel", "Egypt", "Rama", "Ramah", "Galilee", "Nazareth"},
		{"the wilderness", "Judaea", "Jerusalem", "Jordan", "Galilee"},
		{"the wilderness", "temple", "Galilee", "Nazareth", "Capernaum", "beyond the Jordan", "sea of Galilee", "Syria", "Decapolis", "Jerusalem", "Judaea"},
		{"Jerusalem"},
		{null},
		{null},
		{"Capernaum", "Israel", "country of the Gadarenes"},
		{"Israel"},
		{"Israel", "Sodom", "Gomorrha"},
		{"the wilderness", "Chorazin", "Bethsaida", "Tyre", "Sidon", "Capernaum", "Sodom"},
		{"temple", "Nineveh", "the south"},
		{"his own country"},
		{"Gennesaret"},
		{"Jerusalem", "Tyre", "Sidon", "Israel", "sea of Galilee", "Magdala"},
		{"Caesarea Philippi", "Jerusalem"},
		{"an high mountain", "Galilee", "Capernaum"},
		{null},
		{"Galilee", "Judaea", "beyond the Jordan", "Israel"},
		{"Jerusalem", "Jericho"},
		{"Jerusalem", "Bethphage", "mount of Olives", "Sion", "Nazareth", "Galilee", "temple", "Bethany"},
		{null},
		{"temple", "Jerusalem"},
		{"temple", "mount of Olives", "Judaea", "the wilderness"},
		{null},
		{"palace", "Bethany", "at thy house", "mount of Olives", "Galilee", "Gethsemane", "temple", "Nazareth"},
		{"temple", "Israel", "stood before the governor", "common hall", "Cyrene", "Golgotha", "place of a skull", "Galilee", "Arimathaea", "his own new tomb", "unto Pilate"},
		{"Galilee"}
	};

	private static final String[][] Mark = {
		{"the wilderness", "Judaea", "Jerusalem", "Jordan", "Nazareth", "Galilee", "sea of Galilee", "Capernaum"},
		{"Capernaum"},
		{"Galilee", "Judaea", "Jerusalem", "Idumaea", "beyond the Jordan", "Tyre", "Sidon"},
		{null},
		{"country of the Gadarenes", "Decapolis"},
		{"Gomorrha", "his own country", "Galilee", "Bethsaida", "Gennesaret"},
		{"Jerusalem", "Tyre", "Sidon", "sea of Galilee", "Decapolis"},
		{"Dalmanutha", "Bethsaida", "Caesarea Philippi"},
		{"an high mountain", "Galilee", "Capernaum"},
		{"Judaea", "beyond the Jordan", "Jerusalem", "Jericho", "Nazareth"},
		{"Jerusalem", "Bethphage", "Bethany", "mount of Olives", "temple"},
		{"Israel", "temple"},
		{"temple", "mount of Olives", "Judaea"},
		{"Bethany", "upper room", "mount of Olives", "Galilee", "Gethsemane", "temple", "palace"},
		{"Praetorium", "Cyrene", "Golgotha", "place of a skull", "temple", "Israel", "Galilee", "Jerusalem", "Arimathaea", "sepulchre"},
		{"Nazareth", "Galilee"}
	};

	private static final String[][] Luke = {
			{"Judaea", "temple", "Israel", "Galilee", "Nazareth", "the wilderness"},
		{"Syria", "Galilee", "Nazareth", "Judaea", "Bethlehem", "Jerusalem", "Israel", "temple"},
		{"Judaea", "Galilee", "Ituraea", "Trachonitis", "Abilene", "the wilderness", "Jordan"},
		{"Jordan", "the wilderness", "Jerusalem", "temple", "Galilee", "Nazareth", "Capernaum", "his own country", "Israel", "Sidon", "Judaea"},
		{"lake of Gennesaret", "Galilee", "Judaea", "Jerusalem"},
		{"Judaea", "Jerusalem", "Tyre", "Sidon"},
		{"Capernaum", "Israel", "Nain", "Judaea", "the wilderness"},
		{"country of the Gadarenes", "Galilee"},
		{"Bethsaida", "Jerusalem"},
		{"Sodom", "Chorazin", "Bethsaida", "Tyre", "Sidon", "Capernaum", "Jerusalem", "Jericho"},
		{"Nineveh", "the south"},
		{null},
		{"Siloam", "Jerusalem"},
		{null},
		{null},
		{null},
		{"Jerusalem", "Samaria", "Galilee", "Sodom"},
		{"temple", "Jerusalem", "Jericho", "Nazareth"},
		{"Jericho", "Jerusalem", "Bethphage", "Bethany", "mount of Olives", "temple"},
		{"temple"},
		{"temple", "Jerusalem", "Judaea", "mount called Olivet"},
		{"upper room", "Israel", "mount of Olives", "temple", "the hall"},
		{"unto Pilate", "Judaea", "Galilee", "Jerusalem", "Cyrene", "The Skull", "temple", "Arimathaea", "sepulchre"},
		{"Galilee", "Emmaus", "Jerusalem", "Nazareth", "Israel", "Bethany", "temple"}
	};

	private static final String[][] John = {
		{"Jerusalem", "the wilderness", "Bethabara beyond Jordan", "Israel", "Galilee", "Bethsaida", "Nazareth"},
		{"Cana", "Galilee", "Capernaum", "Jerusalem", "temple"},
		{"Israel", "the wilderness", "Judaea", "Aenon", "Salim", "Jordan"},
		{"Judaea", "Galilee", "Samaria", "Sychar", "Jerusalem", "his own country", "Cana", "Capernaum"},
		{"Jerusalem", "Bethesda", "temple"},
		{"sea of Galilee", "sea of Tiberias", "Capernaum", "Tiberias", "the wilderness"},
		{"Galilee", "Judaea", "temple", "Jerusalem", "Bethlehem"},
		{"mount of Olives", "temple"},
		{"Siloam"},
		{"Jerusalem", "temple", "across the Jordan"},
		{"Bethany", "Judaea", "Jerusalem", "the wilderness", "Ephraim", "temple"},
		{"Bethany", "Jerusalem", "Israel", "Sion", "Bethsaida", "Galilee"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"brook Cedron", "garden", "Nazareth", "palace", "hall of judgment", "judgment hall"},
		{"the Pavement", "Gabbatha", "place of a skull", "Golgotha", "Arimathaea", "Jesus' Tomb"},
		{null},
		{"sea of Tiberias", "Cana", "Galilee"}
	};

	private static final String[][] Acts = {
		{"Jerusalem", "Israel", "Judaea", "Samaria", "Galilee", "mount called Olivet", "upper room", "The field of blood"},
		{"Jerusalem", "Mesopotamia", "Judaea", "Cappadocia", "Pontus", "Asia", "Phrygia", "Pamphylia", "Egypt", "Libya", "Cyrene", "Rome", "Israel", "Nazareth", "temple"},
		{"temple", "Nazareth", "Israel"},
		{"temple", "Jerusalem", "Israel", "Nazareth", "Cyprus"},
		{"Jerusalem", "temple", "Israel"},
		{"Syrian Antioch", "Jerusalem", "Cilicia", "Asia", "Nazareth"},
		{"Mesopotamia", "Charran", "land of the Chaldaeans", "Egypt", "Israel", "wilderness", "mount Sinai", "Babylon"},
		{"Jerusalem", "Judaea", "Samaria", "Gaza", "Azotus", "Caesarea"},
		{"Damascus", "Jerusalem", "Tarsus", "Israel", "Caesarea", "Judaea", "Galilee", "Samaria", "Lydda", "Saron", "Joppa"},
		{"Caesarea", "Joppa", "Israel", "Judaea", "Galilee", "Nazareth", "Jerusalem"},
		{"Judaea", "Jerusalem", "Caesarea", "Phenice", "Cyprus", "Syrian Antioch", "Cyrene", "Tarsus"},
		{"Judaea", "Caesarea", "Tyre", "Sidon", "Jerusalem"},
		{"Syrian Antioch", "Cyrene", "Seleucia", "Cyprus", "Salamis", "Paphos", "Perga", "Pamphylia", "Jerusalem", "Pisidian Antioch", "Israel", "Egypt", "wilderness", "Canaan", "Galatia", "Iconium"},
		{"Iconium", "Lystra", "Derbe", "Lycaonia", "Pisidian Antioch", "Pisidia", "Pamphylia", "Perga", "Attalia", "Syrian Antioch"},
		{"Judaea", "Jerusalem", "Phenice", "Samaria", "Syrian Antioch", "Syria", "Cilicia", "Pamphylia", "Cyprus"},
		{"Derbe", "Lystra", "Iconium", "Jerusalem", "Phrygia", "Galatia", "Asia", "Mysia", "Bithynia", "Troas", "Macedonia", "Samothracia", "Neapolis", "Philippi"},
		{"Amphipolis", "Apollonia", "Thessalonica", "Berea", "Athens"},
		{"Athens", "Corinth", "Pontus", "Italy", "Rome", "Macedonia", "Achaia", "Syria", "Cenchrea", "Ephesus", "Caesarea", "Syrian Antioch", "Galatia", "Phrygia", "Alexandria"},
		{"Corinth", "Ephesus", "Macedonia", "Achaia", "Jerusalem", "Rome", "Asia"},
		{"Macedonia", "Greece", "Syria", "Berea", "Derbe", "Troas", "Philippi", "Assos", "Mitylene", "Chios", "Samos", "Miletus", "Ephesus", "Asia", "Jerusalem"},
		{"Cos", "Rhodes", "Patara", "Phenice", "Cyprus", "Syria", "Tyre", "Jerusalem", "Ptolemais", "Caesarea", "Judaea", "temple", "Asia", "Israel", "Egypt", "Tarsus", "Cilicia"},
		{"Tarsus", "Cilicia", "Damascus", "Jerusalem", "Nazareth", "temple"},
		{"Jerusalem", "Rome", "Caesarea", "Antipatris", "Cilicia"},
		{"temple", "Jerusalem", "Asia"},
		{"Jerusalem", "Caesarea", "temple"},
		{"Jerusalem", "Nazareth", "Damascus", "Judaea", "temple"},
		{"Adramyttium", "Asia", "Macedonia", "Thessalonica", "Sidon", "Cyprus", "Cilicia", "Pamphylia", "Myra", "Lycia", "Alexandria", "Italy", "Cnidus", "Crete", "Salmone", "The fair havens", "Lasea", "Phoenix", "Clauda"},
		{"Melita", "Alexandria", "Syracuse", "Rhegium", "Puteoli", "Rome", "Appii", "The three taverns", "Jerusalem", "Israel", "Judaea"}
	};

	private static final String[][] Romans = {
		{"Rome"},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{null},
		{"Gomorrha", "Israel", "Sion", "Sodom"},
		{"Israel"},
		{"Israel", "Sion"},
		{null},
		{null},
		{null},
		{"Achaia", "Illyricum", "Jerusalem", "Judaea", "Macedonia", "Spain"},
		{"Achaia", "Cenchrea"}
	};

	private static final String[][] First_Corinthians = {
		{"Corinth"},
		{null},
		{"temple"},
		{null},
		{null},
		{"temple"},
		{null},
		{"temple"},
		{"temple"},
		{"Israel", "wilderness"},
		{null},
		{null},
		{null},
		{null},
		{"Ephesus"},
		{"Achaia", "Asia", "Ephesus", "Galatia", "Jerusalem", "Macedonia"}
	};

	private static final String[][] Second_Corinthians = {
		{"Achaia", "Asia", "Corinth", "Judaea", "Macedonia"},
		{"Macedonia", "Troas"},
		{"Israel"},
		{null},
		{null},
		{"Corinth", "temple"},
		{"Macedonia"},
		{"Macedonia"},
		{"Achaia", "Macedonia"},
		{null},
		{"Achaia", "Damascus", "Israel", "Macedonia"},
		{null},
		{null}
	};

	private static final String[][] Galatians = {
		{"Arabia", "Cilicia", "Damascus", "Galatia", "Jerusalem", "Judaea", "Syria"},
		{"Jerusalem"},
		{"Galatia"},
		{"Arabia", "Jerusalem", "mount Sinai"},
		{null},
		{"Israel"}
	};

	private static final String[][] Ephesians = {
		{"Ephesus"},
		{"Israel", "temple"},
		{null},
		{null},
		{null},
		{null}
	};

	private static final String[][] Philippians = {
		{"Philippi"},
		{null},
		{"Israel"},
		{"Macedonia", "Philippi", "Thessalonica"}
	};

	private static final String[][] Colossians = {
		{null},
		{"Laodicea"},
		{null},
		{"Hierapolis", "Laodicea"}
	};

	private static final String[][] First_Thessalonians = {
		{"Achaia", "Macedonia"},
		{"Judaea", "Philippi"},
		{"Athens"},
		{"Macedonia"},
		{null}
	};

	private static final String[][] Second_Thessalonians = {
		{null},
		{"temple"},
		{null}
	};

	private static final String[][] First_Timothy = {
		{"Ephesus", "Macedonia"},
		{null},
		{null},
		{null},
		{null},
		{null}
	};

	private static final String[][] Second_Timothy = {
		{"Asia", "Ephesus", "Rome"},
		{null},
		{"Iconium", "Lystra"},
		{"Corinth", "Dalmatia", "Ephesus", "Galatia", "Thessalonica", "Troas"}
	};

	private static final String[][] Titus = {
		{"Crete"},
		{null},
		{"Nicopolis"}
	};

	private static final String[][] Philemon = {
		{null}
	};

	private static final String[][] Hebrews = {
		{null},
		{null},
		{"Egypt", "the wilderness", "wilderness"},
		{null},
		{null},
		{null},
		{"Salem"},
		{"Egypt", "Israel"},
		{null},
		{null},
		{"Egypt", "Israel", "Jericho", "Red sea"},
		{"Esau", "Jerusalem", "Sion"},
		{"Italy"}
	};

	private static final String[][] James = {
		{null},
		{null},
		{null},
		{null},
		{null}
	};

	private static final String[][] First_Peter = {
		{"Asia", "Bithynia", "Cappadocia", "Galatia", "Pontus"},
		{"Sion"},
		{null},
		{null},
		{"Babylon"}
	};

	private static final String[][] Second_Peter = {
		{null},
		{"Gomorrha", "Sodom"},
		{null}
	};

	private static final String[][] First_John = {
		{null},
		{null},
		{null},
		{null},
		{null}
	};

	private static final String[][] Second_John = {
		{null}
	};

	private static final String[][] Third_John = {
		{null}
	};

	private static final String[][] Jude = {
		{"Egypt", "Gomorrha", "Sodom"}
	};

	private static final String[][] Revelations = {
		{"Asia", "Ephesus", "Laodicea", "Philadelphia", "Pergamos", "Patmos", "Sardis", "Smyrna", "Thyatira"},
		{"Ephesus", "Israel", "Pergamos", "Smyrna", "Thyatira"},
		{"Jerusalem", "Laodicea", "Philadelphia", "Sardis", "temple"},
		{null},
		{null},
		{null},
		{"Israel", "temple"},
		{null},
		{"Euphrates"},
		{null},
		{"Egypt", "Sodom", "temple"},
		{null},
		{null},
		{"Babylon", "Sion", "temple"},
		{"temple"},
		{"Babylon", "Euphrates", "temple"},
		{null},
		{"Babylon"},
		{null},
		{"Gog", "Magog"},
		{"Israel", "Jerusalem", "temple"},
		{null}
	};

	private String[][][] allBooks = {
			Genesis, Exodus, Leviticus, Numbers, Deuteronomy, Joshua, Judges, Ruth, First_Samuel, Second_Samuel, First_Kings, Second_Kings, First_Chronicles, Second_Chronicles,
			Ezra, Nehemiah, Esther, Job, Psalms, Proverbs, Ecclesiasties, Song_of_Solomon, Isaiah, Jeremiah, Lamentations, Ezekiel, Daniel, Hosea, Joel, Amos, Obadiah, Jonah,
			Micah, Nahum, Habakkuk, Zechariah, Haggai, Zephaniah, Malachi, Matthew, Mark, Luke, John, Acts, Romans, First_Corinthians, Second_Corinthians, Galatians, Ephesians,
			Philippians, Colossians, First_Thessalonians, Second_Thessalonians, First_Timothy, Second_Timothy, Titus, Philemon, Hebrews, James, First_Peter, Second_Peter,
			First_John, Second_John, Third_John, Jude, Revelations
	};

	public String[][] getBookLocations(int book){
		if(book > 65 || book < 0) {
			throw new IndexOutOfBoundsException();
		}

		return allBooks[book];
	}

}
