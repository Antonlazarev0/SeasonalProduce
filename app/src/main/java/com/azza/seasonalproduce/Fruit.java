package com.azza.seasonalproduce;

/**
 * Created by AZZA Test on 4/30/2017.
 */

public class Fruit {
    private String name;
    private String description;
    private String season;
    private int imageResourceId;

    //fruits is an array of fruit
    public static final Fruit[] fruits = {
            new Fruit("Apple",
                        "The round fruit of a tree of the rose family, which typically has thin green or red skin and crisp flesh. Australia produces a large range of apples, but the top five most popular apples in Australia are: Granny Smith, Red Delicious, Cripps Pink, Fuji and Gala.",
                    "Autumn, Winter",
                    R.drawable.apple),
            new Fruit("Apricot",
                    "A juicy, soft fruit of an orange-yellow colour resembling a small peach. Apricots are a favourite fruit in Australian home orchards. One of the older varieties that is still going strong is ‘Moorpark’, a versatile apricot that is used widely for making jams (preserves).",
                    "Summer",
                    R.drawable.apricot),
            new Fruit("Banana",
                    "A long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe. There are more than 500 varieties of banana plants in the world. The most common kinds are Dwarf Cavendish, Valery, and Williams Hybrid bananas. The most dominant variety in Australia is Cavendish",
                    "Spring, Summer, Autumn, Winter",
                    R.drawable.banana),
            new Fruit("Berry",
                    "A berry is a small, pulpy, and often edible fruit. Berries are usually juicy, rounded, brightly colored, sweet or sour, and do not have a stone or pit, although many pips or seeds may be present. Common examples are strawberries, raspberries, blueberries, and red- and blackcurrants.",
                    "Spring, Summer",
                    R.drawable.berry),
            new Fruit("Cherry",
                    "A small, soft round stone fruit that is typically bright or dark red. There are over 50 cherry varieties in commercial production in Victoria and many more undergoing evaluation as potential varieties, they can be split into two main types sweet or sour.",
                    "Summer",
                    R.drawable.cherry),
            new Fruit("Fig",
                    "A soft pear-shaped fruit with sweet dark flesh and many small seeds, eaten fresh or dried. There are over 20 diffrent varities of fig trees the most popular being Black Geno, Brown Turkey,, Adriatic Fig and Preston Prolific",
                    "Summer, Autumn",
                    R.drawable.fig),
            new Fruit("Grapefruit",
                    "A large round yellow citrus fruit with an acid juicy pulp. The varieties most common in Australia are the Marsh, the Thompson, the Wheeney and the Texan Pink. The Marsh, Thompson and Wheeney have predominantly yellow fruits. The Marsh has fewer seeds. The Texan Pink features the pink coloured fruit.",
            "Spring, Summer, Autumn, Winter",
                    R.drawable.grapefruit),
            new Fruit("Grape",
                    "A berry (typically green, purple, or black) growing in clusters on a grapevine, eaten as fruit and used in making wine. Many table grape varieties are grown in Australia, but the four most popular are Thompson Seedless, Menindee Seedless, Crimson Seedless and Red Globe. The sweet and juicy Thompson Seedless is Australia’s current favourite. There are also many other varieties grown for making wine.",
                    "Summer, Autumn",
                    R.drawable.grape),
            new Fruit("Kiwifruit",
                    "Kiwifruit (often shortened to kiwi) or Chinese gooseberry is the name given to the edible berries of several species of woody vines in the genus Actinidia. Kiwifruit is the most nutrient-dense fruit in the world, delicious dexter being the sweetest",
                    "Winter",
                    R.drawable.kiwifruit),
            new Fruit("Lemons",
                    "A pale yellow oval citrus fruit with thick skin and fragrant, acidic juice. The Lisbon lemon is the most commonly grown lemon in Australia with a few other varieties available",
                    "Spring, Winter",
                    R.drawable.lemon),
            new Fruit("Lime",
                    "A lime is a hybrid citrus fruit, which is typically round, lime green, 3–6 centimetres in diameter, and containing acidic juice vesicles. The most common variety cultivated in Australia are Tahitian limes which are very strong in citrus flavour",
                    "Spring, Winter",
                    R.drawable.lime),
            new Fruit("Mandarin",
                    "A small flattish citrus fruit with a loose yellow-orange skin. Imperials are the most popular mandarin variety in Australia because they are the first to be harvested each season.",
                    "Spring, Autumn, Winter",
                    R.drawable.mandarin),
            new Fruit("Melon",
                    "The large round fruit of a plant of the gourd family, with sweet pulpy flesh and many seeds.  Melon plants are grown as a ground vine and depending on the cultivar, the shape of the fruit may change from oblong to round, the rind from light green to dark green, the flesh from red to yellow and the seeds from white to yellow, brown or black. The major melon types produced in Australia are rockmelons, honeydew melons and watermelons.",
                    "Summer, Autumn",
                    R.drawable.melon),
            new Fruit("Orange",
                    "A large round juicy citrus fruit with a tough bright reddish-yellow rind. Navels are one of the most popular orange varieties and available during the winter from June – October. They are sweet and juicy, rich in orange colour, seedless and easy to peel.",
                    "Winter, Summer, Autumn",
                    R.drawable.orange),
            new Fruit("Peach",
                    "A round stone fruit with juicy yellow flesh and downy pinkish-yellow skin. There are many diffrent varieties of peach cultivated in Australia, Zerbe peach being the main local variety.",
                    "Summer",
                    R.drawable.peach),
            new Fruit("Pear",
                    "A sweet yellowish- or brownish-green edible fruit which is narrow at the stalk and wider towards the base. There are eight main types of pears that are grown in Australian: Beurré Bosc, Corella Forelle, Josephine de Malines, Packham’s Triumph, Red Anjou, Red Sensation , Williams’ Bon Chretien and Winter Nelis. Williams and Packhams are the most popular with many Williams being processed into canning fruit and Packhams mostly sold  fresh.",
                    "Winter, Summer, Autumn",
                    R.drawable.pear),
            new Fruit("Plum",
                    "An oval fleshy fruit which is purple, reddish, or yellow when ripe and contains a flattish pointed stone. In Australia Mariposa with its sweet juicy fruit and Ruby Blood which is a late bearing variety are very popular, another factor that makes plum trees popular is the anti oxidant qualities of the fruit",
                    "Summer",
                    R.drawable.plum)
    };

    //Each fruit has a name, description, seasons and an image resource
    private Fruit(String name, String description, String season, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.season = season;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getSeason() {
        return season;
    }

    public String toString() {
        return this.name;
    }
}
