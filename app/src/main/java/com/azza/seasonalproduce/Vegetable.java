package com.azza.seasonalproduce;

/**
 * Created by AZZA Test on 4/30/2017.
 */

public class Vegetable {
    private String name;
    private String description;
    private String season;
    private int imageResourceId;

    public static final Vegetable[] vegetables = {

            new Vegetable("Artichoke",
                    "The artichoke is a variety of a species of thistle cultivated as a food. The edible portion of the plant consists of the flower buds before the flowers come into bloom. Artichoke varieties come in two primary types: large, round ‘Globe’ artichokes, and elongated, tapered artichokes like ‘Violetta’.",
                    "Winter, Spring",
                    R.drawable.artichoke),

            new Vegetable("Asparagus",
                    "Asparagus, or garden asparagus, scientific name Asparagus officinalis, is a spring vegetable, a flowering perennial plant species in the genus Asparagus. Green asparagus is the most popular variety in Australia, purple asparagus has sweeter thicker spears than green asparagus and is more tender due to its lower fibre content.",
                    "Spring",
                    R.drawable.asparagus),

            new Vegetable("Basil",
                    "Basil also called great basil or Saint-Joseph's-wort, is a culinary herb of the family Lamiaceae. The edible basil that is most familiar to most people would be Sweet or Italian Basil Ocimum basilicum. The plant has large, soft, fragrant, lush foliage that is frost tender, so it grows well through summer and throughout the year in warmer areas of Australia.",
                    "Summer",
                    R.drawable.basil),

            new Vegetable("Beans",
                    "An edible seed, typically kidney-shaped, growing in long pods on certain leguminous plants. There are hundreds of varieties of bean, as the term is applied to any legume whose seeds or pods are eaten and which is not classed as a lentil or a pea. They are grown worldwide and remain a culinary staple in many countries. In Australia, they have enjoyed a dramatic rise in popularity thanks to traditional and peasant dishes such as cassoulet, which are being discovered by a whole new generation of consumers.",
                    "Spring, Summer, Autumn",
                    R.drawable.bean),

            new Vegetable("Beetroot",
                    "The beetroot is the taproot portion of the beet plant, usually known in North America as the beet, also table beet, garden beet, red beet, or golden beet. It is one of several of the cultivated varieties of Beta vulgaris grown for their edible taproots and their leaves (called beet greens). Ther are many varied bettroot varieties and can come in diffrent colours and shapes the most common being round and red.",
                    "Spring, Summer, Autumn, Winter",
                    R.drawable.beetroot),

            new Vegetable("Broccoli",
                    "A cultivated variety of cabbage which bears heads of green or purplish flower buds that are eaten as a vegetable. There is a wide range of cultivars available and these are constantly changing. Virtually all commercial types are hybrids. Two of the most common varieties currently grown are Marathon and Greenbelt.",
                    "Spring, Winter",
                    R.drawable.broccoli),

            new Vegetable("Brussel Sprouts",
                    "The Brussels sprout is a member of the Gemmifera Group of cabbages, grown for its edible buds. Brussel sprouts come in two main varieties which are green or red.",
                    "Autumn, Winter",
                    R.drawable.brusselsprout),

            new Vegetable("Cabbage",
                    "Cabbage or headed cabbage is a leafy green or purple biennial plant, grown as an annual vegetable crop for its dense-leaved heads. There are many varieties and types of cabbage, but in Australia we mostly see green and red. The leaves of red cabbages are smooth and tightly fitted into the head, while some green cabbages, such as the savoy, have loose, darker outer leaves that can vary from smooth to curly.",
                    "Autumn, Winter",
                    R.drawable.cabbage),

            new Vegetable("Capsicum",
                    "Capsicum is the name of a genus of tropical pepper plants that can grow in a wide variety of shapes and sizes. The word \"capsicum\" also refers to the fruit produced by any of these plants, in particular the dried fruits or peppers that are typically used in cooking or as medical supplements and remedies. The 2 primary groups they fall into are sweet or bell peppers, which are mild, and chillies, which can be spicy to extremely hot.",
                    "Spring, Summer, Autumn",
                    R.drawable.capsicum),

            new Vegetable("Carrots",
                    "The carrot is a root vegetable, usually orange in colour, though purple, black, red, white, and yellow cultivars exist. Most of the carrot varieties grown in Australia belong to one of the following four variety groups distinguished by shape although some new varieties, such as Mojo are the result of combining characteristics from several variety groups via conventional plant breeding. The four major variety groups represented in Australia are Nantes, Imperator, Autumn King and Chantenay ",
                    "Spring, Summer, Autumn, Winter",
                    R.drawable.carrot),

            new Vegetable("Cauliflower",
                    "Cauliflower is a cabbage of a variety which bears a large immature flower head of small creamy-white flower buds. The most common cauliflowers available in Australia have a creamy, white head that is surrounded by green leaves. Nowadays, there are a number of new varieties available including the broccoflower, a cauliflower with green curds (or head) that is produced by crossing white cauliflower with broccoli.",
                    "Spring, Autumn, Winter",
                    R.drawable.cauliflower),

            new Vegetable("Celery",
                    "Celery is a cultivated plant of the parsley family, with closely packed succulent leaf stalks which are used as a salad or cooked vegetable. The most common celery has green stalks but a red stalk variety can be grown.",
                    "Autumn, Winter",
                    R.drawable.celery),

            new Vegetable("Corn",
                    "Maize, also known as corn, is a large grain plant first domesticated by indigenous peoples in southern Mexico about 10,000 years ago. The popular varieties grown are hybrids but sweet corn grown in Australia is now broken up into two major types: normal and supersweet.",
                    "Summer, Autumn",
                    R.drawable.corn),

            new Vegetable("Cucumber",
                    "Cucumber is a widely cultivated plant in the gourd family, Cucurbitaceae. It is a creeping vine that bears cucumiform fruits that are used as vegetables. Most of the cucumbers sold in Australia are sold by type and not by variety. The most common cucumbers available are the green cucumbers. Other types of cucumbers include the Continental (or burpless cucumber), which is long, with a hook at the end and ridges on the skin.",
                    "Spring, Summer, Autumn",
                    R.drawable.cucumber),

            new Vegetable("Eggplant",
                    "Eggplant or aubergine, is a species of nightshade, Solanum melongena, grown for its edible fruit. The most common type of eggplant in Australia is the oval deep purple variety which is available in hydroponically and field grown varieties. Hydroponically grown eggplant is generally smoother, shinier and firmer but some people say it has less flavour than the field grown varieties.",
                    "Summer, Autumn",
                    R.drawable.eggplant),

            new Vegetable("Leek",
                    "The leek is a vegetable, a cultivar of Allium ampeloprasum, the broadleaf wild leek. The edible part of the plant is a bundle of leaf sheaths that is sometimes erroneously called a stem or stalk. Leeks are mostly grown in small, outer-urban market gardens, but are becoming popular with home gardeners. A good substitute for onions, they are very adaptable and can be grown under a wide range of conditions.",
                    "Spring, Summer, Autumn, Winter",
                    R.drawable.leek),

            new Vegetable("Lettuce",
                    "Lettuce is an annual plant of the daisy family, Asteraceae. It is most often grown as a leaf vegetable, but sometimes for its stem and seeds. There are four main types of lettuce grown in Australia Iceberg (Crisphead), Butterhead, Cos (Romaine) and Loose leaf. Iceberg lettuce is the main lettuce type grown commercially in Victoria.",
                    "Spring, Summer, Autumn, Winter",
                    R.drawable.lettuce),

            new Vegetable("Onions",
                    "The onion, also known as the bulb onion or common onion, is a vegetable and is the most widely cultivated species of the genus Allium. Onions types can be divided into storage onions and fresh onions. Of the storage onions the most common types are brown, red, white and eschallots. Of the fresh onions what are called shallots in NSW are a straight stemmed plant that comes in bunches.",
                    "Spring, Summer, Autumn, Winter",
                    R.drawable.onion),

            new Vegetable("Parsley",
                    "Parsley or garden parsley is a species of flowering plant in the family Apiaceae, native to the central Mediterranean region, naturalized elsewhere in Europe, and widely cultivated as a herb, a spice, and a vegetable.  there are two basic varieties of parsley – flat leaf and curly leaf. The flat leaf parsley (often called Continental or Italian parsley) has a stronger flavour than the curly leaf parsley.",
                    "Spring, Summer, Autumn, Winter",
                    R.drawable.parsley),

            new Vegetable("Parsnip",
                    "The parsnip is a root vegetable closely related to the carrot and parsley. Popular parsnip varieties include Hollow Crown and White Gold. Parsnips are a hardy, cool-season crop that is best harvested after a hard frost. Parsnips are not only tasty in soups and stews, but can also be enjoyed by themselves.",
                    "Spring, Autumn, Winter",
                    R.drawable.parsnip),

            new Vegetable("Peas",
                    "The pea is most commonly the small spherical seed or the seed-pod of the pod fruit Pisum sativum. Each pod contains several peas. Pea pods are botanically fruit, since they contain seeds and developed from the ovary of a (pea) flower. There are two types of both snow pea and sugar snap peas; determinate and indeterminate.",
                    "Spring, Summer, Autumn, Winter",
                    R.drawable.peas),

            new Vegetable("Potatoe",
                    "The potato is a starchy, tuberous crop from the perennial nightshade Solanum tuberosum. The word \"potato\" may refer either to the plant itself or to the edible tuber. he many different varieties available are subtly different in flavour and texture, and lend themselves best to different forms of cooking.",
                    "Spring, Summer, Autumn, Winter",
                    R.drawable.potato),

            new Vegetable("Rhubarb",
                    "Rhubarb is a species of plant in the family Polygonaceae. It is a herbaceous perennial growing from short, thick rhizomes. Popular types in Australia include ‘Wandin Red’, ‘Silvan Giant’, ‘Ever’ and the green stemmed ‘Queen Victoria.",
                    "Spring, Summer, Autumn, Winter",
                    R.drawable.rhubarb),

            new Vegetable("Silverbeet",
                    "Also known as Chard is a leafy green vegetable often used in Mediterranean cooking. In the Flavescens-Group-cultivars, the leaf stalks are large and are often prepared separately from the leaf blade. The most popular varities of this are asian greens such as bok choi and choy sum",
                    "Spring, Summer, Autumn, Winter",
                    R.drawable.silverbeet),

            new Vegetable("Spinach",
                    "Spinach is an edible flowering plant in the family Amaranthaceae native to central and western Asia. Its leaves are eaten as a vegetable. Spinach varieties come in Savoy, Semi-savoy, and Flat-leafed types, with many cultivars of each. True spinach (Spinacea oleracia) grows best in the cooler temperatures of spring and fall, although early and late varieties can extend the season into summer and winter.",
                    "Spring, Autumn, Winter",
                    R.drawable.spinach),

            new Vegetable("Squash",
                    "Also known as Cucurbita is a genus of herbaceous vines in the gourd family, Cucurbitaceae, also known as cucurbits, native to the Andes and Mesoamerica. In Australia, squash is usually sold by variety. Button squash (yellow squash), marrow, zucchini and spaghetti squash are some of the common varieties that are available.",
                    "Spring, Summer, Autumn",
                    R.drawable.squash),

            new Vegetable("Sweet Potato",
                    "The sweet potato is a dicotyledonous plant that belongs to the morning glory family, Convolvulaceae. Its large, starchy, sweet-tasting, tuberous roots are a root vegetable. The young leaves and shoots are sometimes eaten as greens. There are three main varieties or colours of the Sweet Potato, but generally, there is not much difference in flavour.",
                    "Autumn",
                    R.drawable.sweetpotato),

            new Vegetable("Tomato",
                    "The tomato is the edible fruit of Solanum lycopersicum, commonly known as a tomato plant, which belongs to the nightshade family, Solanaceae. The species originated in Central and South America. There are hundreds of tomato varieties. From marble-sized grape or cherry tomatoes, to juicy salad tomatoes, meaty paste tomatoes, and huge, sweet, beefsteak tomatoes. Their colors range from deep crimson to orange, yellow, green, purple, and chocolate.",
                    "Summer, Autumn",
                    R.drawable.tomato),

            new Vegetable("Turnip",
                    "The turnip or white turnip is a root vegetable commonly grown in temperate climates worldwide for its white, bulbous taproot. Small, tender varieties are grown for human consumption, while larger varieties are grown as feed for livestock. n Australia, turnips are not usually sold by variety. Turnips can vary in size, shape and colour. Most have white flesh and the skin can be creamy-white or green with green or purple tops. Baby turnips are also available and these are smaller in size because they are picked earlier than mature turnips. Presto and Cueball are two types of pure white baby turnips. Baby turnips taste milder than larger turnips and can be eaten raw or grated in salads.",
                    "Winter",
                    R.drawable.turnip),

            new Vegetable("Zucchini",
                    "Zucchini or courgette is a summer squash which can reach nearly a meter in length, but is usually harvested immature at 15 to 25 cm. In the British Isles, a fully grown zucchini is referred to as a marrow. Zucchini are usually dark green, but may also be yellow or light green and they have a similar shape to a cucumber. There are a few cultivars with round or bottle shaped fruits.Most commercially grown zucchini cultivars are hybrids because they are usually heavier producers than open-pollinating types.",
                    "Spring, Summer, Autumn",
                    R.drawable.zucchini)
    };

    private Vegetable(String name, String description, String season, int imageResourceId) {
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
