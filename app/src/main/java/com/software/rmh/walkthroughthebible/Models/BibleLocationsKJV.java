package com.software.rmh.walkthroughthebible.Models;

/**
 * Created by rhoffman on 2/5/17.
 *
 * Storage of all locations in the KJV Bible.
 */

public class BibleLocationsKJV {

	private static final String[] genesisOne = null;
	private static final String[] genesisTwo = {"Eden", "Pison", "Havilah", "Gihon", "Ethiopia", "Assyria", "Hiddekel", "Euphrates"};
	private static final String[] genesisThree = {"Eden"};
	private static final String[] genesisFour = {"Eden"};
	private static final String[] genesisFive = null;
	private static final String[] genesisSix = null;
	private static final String[] genesisSeven = null;
	private static final String[] genesisEight = {"Ararat"};
	private static final String[] genesisNine = null;
	private static final String[] genesisTen = {"Babel", "Erech", "Accad", "Calneh", "Shinar", "Assyria", "Nineveh", "Rehoboth", "Resen", "Calah", "Sidon", "Gerar", "Gaza", "Sodom", "Gomorrah", "Admah", "Zeboim", "Lasha", "Mesha", "Sephar"};
	private static final String[] genesisEleven = {"Shinar", "Babel", "Ur of the Chaldees", "Haran", "Canaan"};
	private static final String[] genesisTwelve = {"Haran", "Canaan", "Shechem", "Moreh", "Bethel", "Hai", "Egypt"};
	private static final String[] genesisThirteen = {"Egypt", "Negeb", "Bethel", "Hai", "plain of Jordan", "Zoar", "Sodom", "Gomorrah", "Canaan", "Mamre", "Hebron"};
	private static final String[] genesisFourteen = {"Shinar", "Ellasar", "Elam", "Sodom", "Gomorrah", "Admah", "Zeboiim", "Bela", "Zoar", "vale of Siddim", "salt sea", "Ashteroth Karnaim", "Ham", "Shaveh Kiriathaim", "Seir", "Elparan", "Enmishpat", "Kadesh", "Engedi", "Hazazontamar", "Hazezontamar", "Mamre", "Dan", "Hobah", "Damascus", "valley of Shaveh", "king's dale", "Salem"};
	private static final String[] genesisFifteen = {"Damascus", "Ur of the Chaldees", "Egypt", "Euphrates"};
	private static final String[] genesisSixteen = {"Canaan", "Shur", "Beerlahairoi", "Kadesh", "Bered"};
	private static final String[] genesisSeventeen = {"Canaan"};
	private static final String[] genesisEighteen = {"Mamre", "Sodom", "Gomorrah"};
	private static final String[] genesisNineteen = {"Sodom", "Zoar", "Gomorrah"};
	private static final String[] genesisTwenty = {"Negeb", "Kadesh", "Shur", "Gerar"};
	private static final String[] genesisTwentyone = {"Beersheba", "wilderness of Paran", "Egypt"};
	private static final String[] genesisTwentytwo = {"Moriah", "Beersheba"};
	private static final String[] genesisTwentythree = {"Kirjatharba", "Hebron", "Canaan", "Machpelah", "Mamre"};
	private static final String[] genesisTwentyfour = {"Mesopotamia", "Nahor", "Beerlahairoi", "Negeb"};
	private static final String[] genesisTwentyfive = {"Machpelah", "Ephron", "Mamre", "Beerlahairoi", "Havilah", "Shur", "Egypt", "Assyria", "Padanaram"};
	private static final String[] genesisTwentysix = {"Gerar", "Egypt", "valley of Gerar", "Esek", "Sitnah", "Rehoboth", "Beersheba"};
	private static final String[] genesisTwentyseven = {"Haran"};
	private static final String[] genesisTwentyeight = {"Padanaram", "Beersheba", "Haran", "Bethel", "Luz"};
	private static final String[] genesisTwentynine = {"Haran"};
	private static final String[] genesisThirty = null;
	private static final String[] genesisThirtyone = {"Bethel", "Canaan", "Euphrates", "Gilead", "Jegarsahadutha", "Galeed", "Mizpah"};
	private static final String[] genesisThirtytwo = {"Mahanaim", "Seir", "Edom", "Jordan", "Jabbok", "Penuel"};
	private static final String[] genesisThirtythree = {"Seir", "Succoth", "Shechem", "Canaan", "Padanaram", "EleloheIsrael"};
	private static final String[] genesisThirtyfour = {"Israel", "Shechem"};
	private static final String[] genesisThirtyfive = {"Bethel", "Shechem", "Luz", "Canaan", "Elbethel", "Allonbachuth", "Ephrath", "Bethlehem", "Edar", "Padanaram", "Mamre", "Kirjatharba", "Hebron"};
	private static final String[] genesisThirtysix = {"Canaan", "Seir", "Edom", "Dinhabah", "Moab", "Avith", "Euphrates"};
	private static final String[] genesisThirtyseven = {"Canaan", "Shechem", "vale of Hebron", "Dothan", "Gilead", "Egypt"};
	private static final String[] genesisThirtyeight = {"Chezib", "Timnah"};
	private static final String[] genesisThirtynine = {"Egypt"};
	private static final String[] genesisFourty = {"Egypt"};
	private static final String[] genesisFourtyone = {"the river", "Egypt"};
	private static final String[] genesisFourtytwo = {"Egypt", "Canaan"};
	private static final String[] genesisFourtythree = {"Egypt"};
	private static final String[] genesisFourtyfour = {"Canaan"};
	private static final String[] genesisFourtyfive = {"Egypt", "Goshen", "Canaan"};
	private static final String[] genesisFourtysix = {"Beersheba", "Egypt", "Canaan", "Padanaram", "Goshen"};
	private static final String[] genesisFourtyseven = {"Canaan", "Goshen", "Egypt", "Rameses"};
	private static final String[] genesisFourtyeight = {"Luz", "Canaan", "Egypt", "Padan", "Ephrath", "Bethlehem"};
	private static final String[] genesisFourtynine = {"Sidon", "Ephron", "Machpelah", "Mamre", "Canaan"};
	private static final String[] genesisFifty = {"Canaan", "Egypt", "Goshen", "Atad", "Jordan", "Abelmizraim", "Machpelah", "Mamre", "Ephron"};

	private static final String[][] genesis = {
			genesisOne, genesisTwo, genesisThree, genesisFour, genesisFive, genesisSix, genesisSeven, genesisEight, genesisNine, genesisTen, genesisEleven, genesisTwelve, genesisThirteen, genesisFourteen,
			genesisFifteen, genesisSixteen, genesisSeventeen, genesisEighteen, genesisNineteen, genesisTwenty, genesisTwentyone, genesisTwentytwo, genesisTwentythree, genesisTwentyfour, genesisTwentyfive,
			genesisTwentysix, genesisTwentyseven, genesisTwentyeight, genesisTwentynine, genesisThirty, genesisThirtyone, genesisThirtytwo, genesisThirtythree, genesisThirtyfour, genesisThirtyfive,
			genesisThirtysix, genesisThirtyseven, genesisThirtyeight, genesisThirtynine, genesisFourty, genesisFourtyone, genesisFourtytwo, genesisFourtythree, genesisFourtyfour, genesisFourtyfive,
			genesisFourtysix, genesisFourtyseven, genesisFourtyeight, genesisFourtynine, genesisFifty
	};

	private static final String[] exOne = {"Egypt", "Pithom", "Raamses", "the river"};
	private static final String[] exTwo = {"Midian", "Egypt"};
	private static final String[] exThree = {"Midian", "Horeb", "Egypt"};
	private static final String[] exFour = {"the river", "Egypt", "Midian"};
	private static final String[] exFive = {"Egypt"};
	private static final String[] exSix = {"Canaan", "Egypt"};
	private static final String[] exSeven = {"Egypt", "the river"};
	private static final String[] exEight = {"the river", "Egypt", "Goshen"};
	private static final String[] exNine = {"Egypt", "Goshen"};
	private static final String[] exTen = {"Egypt", "Red sea"};
	private static final String[] exEleven = {"Egypt"};
	private static final String[] exTwelve = {"Egypt", "Rameses", "Succoth (Egypt)"};
	private static final String[] exThirteen = {"Egypt", "Red sea", "Succoth (Egypt)", "Etham"};
	private static final String[] exFourteen = {"Pihahiroth", "Migdol", "Baalzephon", "Egypt"};
	private static final String[] exFifteen = {"Red sea", "Palestina", "Edom", "Moab", "Canaan", "Shur", "Marah", "Elim"};
	private static final String[] exSixteen = {"Elim", "wilderness of Sin", "Sinai", "Egypt", "Canaan"};
	private static final String[] exSeventeen = {"wilderness of Sin", "Rephidim", "Egypt", "the river", "Horeb", "Massah", "Meribah in Sinai"};
	private static final String[] exEighteen = {"Midian", "Egypt"};
	private static final String[] exNineteen = {"Egypt", "Sinai", "Rephidim", "mount Sinai"};
	private static final String[] exTwenty = {"Egypt"};
	private static final String[] exTwentyone = null;
	private static final String[] exTwentytwo = {"Egypt"};
	private static final String[] exTwentythree = {"Egypt", "Red sea", "sea of the Philistines", "Euphrates"};
	private static final String[] exTwentyfour = {"mount Sinai"};
	private static final String[] exTwentyfive = null;
	private static final String[] exTwentysix = null;
	private static final String[] exTwentyseven = null;
	private static final String[] exTwentyeight = null;
	private static final String[] exTwentynine = {"Egypt"};
	private static final String[] exThirty = null;
	private static final String[] exThirtyone = {"mount Sinai"};
	private static final String[] exThirtytwo = {"Egypt"};
	private static final String[] exThirtythree = {"Egypt", "mount Horeb"};
	private static final String[] exThirtyfour = {"mount Sinai", "Egypt"};
	private static final String[] exThirtyfive = null;
	private static final String[] exThirtysix = null;
	private static final String[] exThirtyseven = null;
	private static final String[] exThirtyeight = null;
	private static final String[] exThirtynine = null;
	private static final String[] exFourty = null;

	private static final String[][] exodus = {
			exOne, exTwo, exThree, exFour, exFive, exSix, exSeven, exEight, exNine, exTen, exEleven, exTwelve, exThirteen, exFourteen, exFifteen, exSixteen, exSeventeen, exEighteen, exNineteen,
			exTwenty, exTwentyone, exTwentytwo, exTwentythree, exTwentyfour, exTwentyfive, exTwentysix, exTwentyseven, exTwentyeight, exTwentynine, exThirty, exThirtyone, exThirtytwo, exThirtytwo,
			exThirtythree, exThirtyfour, exThirtyfive, exThirtysix, exThirtyseven, exThirtyeight, exThirtynine, exFourty
	};

}
