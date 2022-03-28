package com.jumboexercise.jumbo.mockedObjects;

import com.google.gson.Gson;
import com.jumboexercise.jumbo.domain.model.Stores;

public class StoresMocked {
    private static String jsonTopFiveResponse = "{\"stores\":[{\"city\":\"Veghel\",\"postalCode\":\"5462 EH\",\"street\":\"Verlengde Noordkade\",\"street2\":\"14\",\"street3\":\"\",\"addressName\":\"Jumbo Veghel Foodmarkt Veghel\",\"uuid\":\"63UKYx4XPsEAAAFQvl1eATqA\",\"longitude\":5.52916,\"latitude\":51.615748,\"complexNumber\":\"32243\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"4717\",\"todayClose\":\"21:00\"},{\"city\":\"Veghel\",\"postalCode\":\"5463 HT\",\"street\":\"de Boekt\",\"street2\":\"20\",\"street3\":\"\",\"addressName\":\"Jumbo Veghel de Boekt\",\"uuid\":\"w98KYx4X318AAAFIqFYYwKxK\",\"longitude\":5.546608,\"latitude\":51.609031,\"complexNumber\":\"32115\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"Supermarkt\",\"collectionPoint\":false,\"sapStoreID\":\"4824\",\"todayClose\":\"21:00\"},{\"city\":\"Veghel\",\"postalCode\":\"5467 JZ\",\"street\":\"De Bunders\",\"street2\":\"68\",\"street3\":\"\",\"addressName\":\"Jumbo Veghel De Bunders\",\"uuid\":\"SjwKYx4XWsYAAAFIpy8YwKxK\",\"longitude\":5.558496,\"latitude\":51.623732,\"complexNumber\":\"30057\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"Supermarkt\",\"collectionPoint\":false,\"sapStoreID\":\"4615\",\"todayClose\":\"21:00\"},{\"city\":\"Heeswijk Dinther\",\"postalCode\":\"5473 GA\",\"street\":\"St. Servatiusstraat\",\"street2\":\"39\",\"street3\":\"\",\"addressName\":\"Jumbo Heeswijk Dinther St. Servatiusstraat\",\"uuid\":\"qe4KYx4X_K8AAAFIK0gYwKrH\",\"longitude\":5.474725,\"latitude\":51.648961,\"complexNumber\":\"32046\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"4864\",\"todayClose\":\"21:00\"},{\"city\":\"Schijndel\",\"postalCode\":\"5481 SG\",\"street\":\"Rooiseheide\",\"street2\":\"5\",\"street3\":\"\",\"addressName\":\"Jumbo Schijndel Rooiseheide\",\"uuid\":\"0hkKYx4X1wEAAAFJ0VpBh0Gd\",\"longitude\":5.446227,\"latitude\":51.605829,\"complexNumber\":\"32092\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"4897\",\"todayClose\":\"21:00\"}]}";
    private static String jsonStores = "{\"stores\":[{\"city\":\"'s Gravendeel\",\"postalCode\":\"3295 BD\",\"street\":\"Kerkstraat\",\"street2\":\"37\",\"street3\":\"\",\"addressName\":\"Jumbo 's Gravendeel Gravendeel Centrum\",\"uuid\":\"EOgKYx4XFiQAAAFJa_YYZ4At\",\"longitude\":\"4.615551\",\"latitude\":\"51.778461\",\"complexNumber\":\"33249\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"3605\",\"todayClose\":\"20:00\"},{\"city\":\"'s-Heerenberg\",\"postalCode\":\"7041 JE\",\"street\":\"Stadsplein\",\"street2\":\"71\",\"street3\":\"\",\"addressName\":\"Jumbo 's-Heerenberg Stadsplein\",\"uuid\":\"7ewKYx4Xqp0AAAFIHigYwKrH\",\"longitude\":\"6.245829\",\"latitude\":\"51.874272\",\"complexNumber\":\"30170\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"Supermarkt\",\"sapStoreID\":\"4670\",\"todayClose\":\"21:00\"},{\"city\":\"Aalsmeer\",\"postalCode\":\"1431 HN\",\"street\":\"Ophelialaan\",\"street2\":\"124\",\"street3\":\"\",\"addressName\":\"Jumbo Aalsmeer Ophelialaan\",\"uuid\":\"gssKYx4XJwoAAAFbn.BMqPTb\",\"longitude\":\"4.762433\",\"latitude\":\"52.264417\",\"complexNumber\":\"33010\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"3178\",\"todayClose\":\"22:00\"},{\"city\":\"Aalst\",\"postalCode\":\"5582 CL\",\"street\":\"Hortensialaan\",\"street2\":\"2\",\"street3\":\"\",\"addressName\":\"Jumbo Aalst Paul en Marjon Houben\",\"uuid\":\"Tk0KYx4XZ3YAAAFc_DRE1DKo\",\"longitude\":\"5.469597\",\"latitude\":\"51.399843\",\"complexNumber\":\"33011\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"3754\",\"todayClose\":\"20:00\"},{\"city\":\"Aalten\",\"postalCode\":\"7122 WJ\",\"street\":\"Admiraal de Ruyterstraat\",\"street2\":\"10\",\"street3\":\"\",\"addressName\":\"Jumbo Aalten Leussink\",\"uuid\":\"0XcKYx4XNRQAAAFI3LgYwKxK\",\"longitude\":\"6.576066\",\"latitude\":\"51.923993\",\"complexNumber\":\"30519\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"6487\",\"todayClose\":\"21:00\"},{\"city\":\"Aardenburg\",\"postalCode\":\"4527 BK\",\"street\":\"Peurssensstraat\",\"street2\":\"21\",\"street3\":\"\",\"addressName\":\"Jumbo Aardenburg Ingels\",\"uuid\":\"HocKYx4XP6wAAAFM3VBYQRZw\",\"longitude\":\"3.444601\",\"latitude\":\"51.275006\",\"complexNumber\":\"33012\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"3726\",\"todayClose\":\"19:00\"},{\"city\":\"Alkmaar\",\"postalCode\":\"1824 XT\",\"street\":\"Muiderwaard\",\"street2\":\"416\",\"street3\":\"\",\"addressName\":\"Jumbo Alkmaar Duijvelshoff\",\"uuid\":\"V7cKYx4X0QUAAAFMTmYM5CXj\",\"longitude\":\"4.749492\",\"latitude\":\"52.645601\",\"complexNumber\":\"33282\",\"showWarningMessage\":true,\"todayOpen\":\"Gesloten\",\"locationType\":\"Supermarkt\",\"sapStoreID\":\"3574\",\"todayClose\":\"Gesloten\"},{\"city\":\"Alkmaar\",\"postalCode\":\"1827 LB\",\"street\":\"J. Naberstraat\",\"street2\":\"49-51\",\"street3\":\"\",\"addressName\":\"Jumbo Alkmaar J. Naberstraat\",\"uuid\":\"lFoKYx4X5PcAAAFIjrwYwKxJ\",\"longitude\":\"4.766146\",\"latitude\":\"52.665822\",\"complexNumber\":\"33504\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"3047\",\"todayClose\":\"22:00\"},{\"city\":\"Alkmaar\",\"postalCode\":\"1811 KH\",\"street\":\"Paardenmarkt\",\"street2\":\"2\",\"street3\":\"\",\"addressName\":\"Jumbo Alkmaar Paardenmarkt\",\"uuid\":\"HLkKYx4XyjkAAAFICUgYwKxK\",\"longitude\":\"4.745031\",\"latitude\":\"52.633740\",\"complexNumber\":\"30043\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"Supermarkt\",\"sapStoreID\":\"4688\",\"todayClose\":\"21:00\"},{\"city\":\"Alkmaar\",\"postalCode\":\"1824 HX\",\"street\":\"Winkelwaard\",\"street2\":\"486\",\"street3\":\"\",\"addressName\":\"Jumbo Alkmaar Winkelwaard\",\"uuid\":\"kiAKYx4XTw4AAAFKH9h0LVDS\",\"longitude\":\"4.759373\",\"latitude\":\"52.645642\",\"complexNumber\":\"33508\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"3617\",\"todayClose\":\"22:00\"},{\"city\":\"Almelo\",\"postalCode\":\"7601 BD\",\"street\":\"Bornerbroeksestraat\",\"street2\":\"79\",\"street3\":\"\",\"addressName\":\"Jumbo Almelo Bornerbroeksestraat\",\"uuid\":\"ApoKYx4XqrYAAAFT48gG6uPF\",\"longitude\":\"6.660543\",\"latitude\":\"52.349813\",\"complexNumber\":\"32254\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"4946\",\"todayClose\":\"21:00\"},{\"city\":\"Almere\",\"postalCode\":\"1316 HC\",\"street\":\"Geinplein\",\"street2\":\"32-37\",\"street3\":\"\",\"addressName\":\"Jumbo Almere Waterwijk Geinplein\",\"uuid\":\"gi8KYx4XGtUAAAFIQlIYwKxK\",\"longitude\":\"5.224110\",\"latitude\":\"52.384906\",\"complexNumber\":\"32004\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"4817\",\"todayClose\":\"22:00\"},{\"city\":\"Almere-Buiten\",\"postalCode\":\"1334 KB\",\"street\":\"Detroitpad\",\"street2\":\"1\",\"street3\":\"\",\"addressName\":\"Jumbo Almere-Buiten Detroitpad\",\"uuid\":\"MKUKYx4XUdYAAAFJpwcYZ4CR\",\"longitude\":\"5.274883\",\"latitude\":\"52.395474\",\"complexNumber\":\"33014\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"3094\",\"todayClose\":\"22:00\"},{\"city\":\"Almere-Haven\",\"postalCode\":\"1356 AZ\",\"street\":\"Jaagmeent\",\"street2\":\"250\",\"street3\":\"\",\"addressName\":\"Jumbo Almere-Haven Jaagmeent\",\"uuid\":\"A4UKYx4XavkAAAFI3soYwKxJ\",\"longitude\":\"5.231883\",\"latitude\":\"52.336693\",\"complexNumber\":\"32225\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"3098\",\"todayClose\":\"22:00\"},{\"city\":\"Alphen aan den Rijn\",\"postalCode\":\"2402 DK\",\"street\":\"Herenhof\",\"street2\":\"183\",\"street3\":\"\",\"addressName\":\"Jumbo Alphen aan den Rijn Ten Brink Food\",\"uuid\":\"iWwKYx4Xu7gAAAFNmhtasGod\",\"longitude\":\"4.661277\",\"latitude\":\"52.150632\",\"complexNumber\":\"33238\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"3546\",\"todayClose\":\"20:00\"},{\"city\":\"Amerongen\",\"postalCode\":\"3958 XH\",\"street\":\"Koenestraat\",\"street2\":\"36\",\"street3\":\"\",\"addressName\":\"Jumbo Amerongen Koenestraat\",\"uuid\":\"xf0KYx4XpRcAAAFIL5EYwKxK\",\"longitude\":\"5.461122\",\"latitude\":\"52.002437\",\"complexNumber\":\"30489\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"Supermarkt\",\"sapStoreID\":\"6366\",\"todayClose\":\"21:00\"},{\"city\":\"Amersfoort\",\"postalCode\":\"3823 ET\",\"street\":\"Emiclaerhof\",\"street2\":\"248\",\"street3\":\"\",\"addressName\":\"Jumbo Amersfoort Den Blanken Emiclaer\",\"uuid\":\"iiIKYx4XwVgAAAFMzechgUnv\",\"longitude\":\"5.398059\",\"latitude\":\"52.185990\",\"complexNumber\":\"33018\",\"showWarningMessage\":true,\"todayOpen\":\"07:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"3540\",\"todayClose\":\"22:00\"},{\"city\":\"Amersfoort\",\"postalCode\":\"3824 EE\",\"street\":\"Zonnewijzer\",\"street2\":\"21\",\"street3\":\"\",\"addressName\":\"Jumbo Amersfoort Den Blanken Nieuwland\",\"uuid\":\"3kIKYx4XYocAAAFNDH47frdc\",\"longitude\":\"5.376590\",\"latitude\":\"52.199279\",\"complexNumber\":\"33021\",\"showWarningMessage\":true,\"todayOpen\":\"07:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"3426\",\"todayClose\":\"22:00\"},{\"city\":\"Amersfoort\",\"postalCode\":\"3817 KD\",\"street\":\"Leusderweg\",\"street2\":\"152\",\"street3\":\"\",\"addressName\":\"Jumbo Amersfoort Leusderweg.\",\"uuid\":\"xSgKYx4XXk0AAAFTOqsG6pvj\",\"longitude\":\"5.381369\",\"latitude\":\"52.143866\",\"complexNumber\":\"32257\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"SupermarktPuP\",\"collectionPoint\":true,\"sapStoreID\":\"4730\",\"todayClose\":\"21:00\"},{\"city\":\"Amersfoort\",\"postalCode\":\"3814 BR\",\"street\":\"Neptunusplein\",\"street2\":\"66A\",\"street3\":\"\",\"addressName\":\"Jumbo Amersfoort Neptunusplein\",\"uuid\":\"uM0KYx4X0l0AAAFIDEEYwKrH\",\"longitude\":\"5.399515\",\"latitude\":\"52.162897\",\"complexNumber\":\"32005\",\"showWarningMessage\":true,\"todayOpen\":\"08:00\",\"locationType\":\"Supermarkt\",\"sapStoreID\":\"4830\",\"todayClose\":\"20:00\"}]}";

    public static Stores getTopFiveOk() {
        var topFive = new Gson().fromJson(jsonTopFiveResponse, Stores.class);

        return topFive;
    }

    public static Stores getStoresOk() {
        var stores = new Gson().fromJson(jsonStores, Stores.class);

        return stores;
    }
}
