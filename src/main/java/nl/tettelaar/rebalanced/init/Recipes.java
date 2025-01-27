package nl.tettelaar.rebalanced.init;

import java.util.Arrays;

import net.minecraft.block.Blocks;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.VillagerProfession;
import nl.tettelaar.rebalanced.api.RecipeAPI;

public class Recipes {

	private static final String COD = "cooked_cod;cooked_cod_from_campfire_cooking;cooked_cod_from_smoking";
	private static final String SALMON = "cooked_salmon;cooked_salmon_from_campfire_cooking;cooked_salmon_from_smoking";
	private static final String KELP = "dried_kelp_from_smelting;fried_kelp_from_campfire_cooking;dried_kelp_from_smokin";
	private static final String PORKCHOP = "cooked_porkchop;cooked_porkchop_from_campfire_cooking;cooked_porkchop_from_smoking";
	private static final String BEEF = "cooked_beef;cooked_beef_from_campfire_cooking;cooked_beef_from_smoking";
	private static final String CHICKEN = "cooked_chicken;cooked_chicken_from_campfire_cooking;cooked_chicken_from_smoking";
	private static final String RABBIT = "cooked_chicken;cooked_chicken_from_campfire_cooking;cooked_chicken_from_smoking";
	private static final String MUTTON = "cooked_mutton;cooked_mutton_from_campfire_cooking;cooked_mutton_from_smoking";
	
	public static void init() {
		initKnowledgeBooks();
		initGolems();
	}

	private static void initKnowledgeBooks() {
		// LOOTTABLES
		//common
		RecipeAPI.registerKnowledgeBook(
				Arrays.asList("stone_sword", "stone_pickaxe", "stone_axe", "stone_shovel", "stone_hoe", "bread", PORKCHOP, KELP, RABBIT),
				Arrays.asList("betterdungeons:small_dungeon/chests/loot_piles", "betterdungeons:small_dungeon", "chests/simple_dungeon", "chests/abandoned_mineshaft", "chests/pillager_outpost", "chests/shipwreck_supply", "chests/underwater_ruin_small"),
				1);
		
		//pillagers
		RecipeAPI.registerKnowledgeBook(Arrays.asList("crossbow"), Arrays.asList("chests/pillager_outpost"), 1);

		
		//nether structures
		RecipeAPI.registerKnowledgeBook(
				Arrays.asList("golden_sword", "golden_pickaxe", "golden_axe", "golden_shovel", "golden_hoe", PORKCHOP, "mushroom_stew"),
				Arrays.asList("chests/ruined_portal", "chests/bastion_bridge", "chests/bastion_other", "chests/nether_bridge"),
				3);
		
		RecipeAPI.registerKnowledgeBook(
				Arrays.asList("stone_sword", "stone_pickaxe", "stone_axe", "stone_shovel", "stone_hoe"),
				Arrays.asList("chests/ruined_portal", "chests/bastion_bridge", "chests/bastion_other", "chests/nether_bridge"),	1);
		
		// VILLAGERS
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.ARMORER, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.ARMORER, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.ARMORER, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.ARMORER, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("blast_furnace"), 20, 40, 0.7f, VillagerProfession.ARMORER, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList(RABBIT, PORKCHOP), 3, 10, 0.5f, VillagerProfession.BUTCHER, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(BEEF, CHICKEN, MUTTON), 3, 10, 0.5f, VillagerProfession.BUTCHER, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(RABBIT, PORKCHOP), 3, 10, 0.5f, VillagerProfession.BUTCHER, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(RABBIT, PORKCHOP), 3, 10, 0.5f, VillagerProfession.BUTCHER, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("smoker"), 20, 40, 0.7f, VillagerProfession.BUTCHER, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.CARTOGRAPHER, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.CARTOGRAPHER, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.CARTOGRAPHER, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.CARTOGRAPHER, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("cartography_table"), 20, 40, 0.7f, VillagerProfession.CARTOGRAPHER, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.CLERIC, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.CLERIC, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.CLERIC, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.CLERIC, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("brewing_stand"), 20, 40, 0.7f, VillagerProfession.CLERIC, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList("golden_hoe"), 3, 10, 0.5f, VillagerProfession.FARMER, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.FARMER, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.FARMER, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.FARMER, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("composter"), 20, 40, 0.7f, VillagerProfession.FARMER, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList(COD), 10, 32, 0.2f, VillagerProfession.FISHERMAN, 1, 5);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(SALMON, KELP), 10, 32, 0.2f, VillagerProfession.FISHERMAN, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("fishing_rod", "compass", "spyglass"), 3, 10, 0.8f, VillagerProfession.FISHERMAN, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(SALMON), 10, 32, 0.4f, VillagerProfession.FISHERMAN, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(COD), 10, 32, 0.7f, VillagerProfession.FISHERMAN, 3, 3);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(SALMON), 3, 10, 0.7f, VillagerProfession.FISHERMAN, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("barrel"), 20, 40, 1f, VillagerProfession.FISHERMAN, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.FLETCHER, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.FLETCHER, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.FLETCHER, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.FLETCHER, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("fletching_table"), 20, 40, 0.7f, VillagerProfession.FLETCHER, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.LEATHERWORKER, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.LEATHERWORKER, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.LEATHERWORKER, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.LEATHERWORKER, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("cauldron"), 20, 40, 0.7f, VillagerProfession.LEATHERWORKER, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.LIBRARIAN, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.LIBRARIAN, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.LIBRARIAN, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.LIBRARIAN, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("lectern"), 20, 40, 0.7f, VillagerProfession.LIBRARIAN, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.MASON, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.MASON, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.MASON, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.MASON, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("stonecutter"), 20, 40, 0.7f, VillagerProfession.MASON, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.SHEPHERD, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.SHEPHERD, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.SHEPHERD, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.SHEPHERD, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("loom"), 20, 40, 0.7f, VillagerProfession.SHEPHERD, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList("golden_pickaxe", "golden_axe", "golden_shovel", "golden_hoe"), 3, 10, 0.5f, VillagerProfession.TOOLSMITH, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.TOOLSMITH, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.TOOLSMITH, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.TOOLSMITH, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("smithing_table"), 20, 40, 0.7f, VillagerProfession.TOOLSMITH, 5, 1);
		
		RecipeAPI.registerKnowledgeBook(Arrays.asList("gold_sword", "gold_axe"), 3, 10, 0.5f, VillagerProfession.WEAPONSMITH, 1, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.WEAPONSMITH, 2, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.WEAPONSMITH, 3, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList(""), 3, 10, 0.5f, VillagerProfession.WEAPONSMITH, 4, 1);
		RecipeAPI.registerKnowledgeBook(Arrays.asList("grindstone"), 20, 40, 0.7f, VillagerProfession.WEAPONSMITH, 5, 1);
	}

	private static void initGolems() {
		RecipeAPI.registerBlockRecipe(new Identifier("iron_golem"));
		RecipeAPI.registerBlockRecipe(new Identifier("snow_golem"));
		RecipeAPI.registerBlockRecipe(new Identifier("wither"));
		RecipeAPI.registerBlockRecipe(new Identifier("nether_portal"));
	}

}
