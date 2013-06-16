package bse.phin.common;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import bse.phin.armor.Itembluestoneboots;
import bse.phin.armor.Itembluestonechestplate;
import bse.phin.armor.Itembluestonediamondboots;
import bse.phin.armor.Itembluestonediamondchestplate;
import bse.phin.armor.Itembluestonediamondhelmet;
import bse.phin.armor.Itembluestonediamondpants;
import bse.phin.armor.Itembluestonehelmet;
import bse.phin.armor.Itembluestonepants;
import bse.phin.blocks.Blockbluecobblestone;
import bse.phin.blocks.Blockblueglowstone;
import bse.phin.blocks.Blockbluestoneblock;
import bse.phin.blocks.Blockbluestonediamondblock;
import bse.phin.blocks.Blockbluestonediamondore;
import bse.phin.blocks.Blockbluestonefence;
import bse.phin.blocks.Blockbluestonegravel;
import bse.phin.blocks.Blockbluestoneleaf;
import bse.phin.blocks.Blockbluestonemachineblock;
import bse.phin.blocks.Blockbluestoneore;
import bse.phin.blocks.Blockbluestoneoredust;
import bse.phin.blocks.Blockbluestoneplank;
import bse.phin.blocks.Blockbluestonetorch;
import bse.phin.blocks.Blockchisledbluestone;
import bse.phin.items.Itembluestonediamond;
import bse.phin.items.Itembluestonediamondplate;
import bse.phin.items.Itembluestonedust;
import bse.phin.items.Itembluestoneingot;
import bse.phin.items.Itembluestonestick;
import bse.phin.items.Itembluestonewooddust;
import bse.phin.tool.Itembluestoneaxe;
import bse.phin.tool.Itembluestonediamondaxe;
import bse.phin.tool.Itembluestonediamondhoe;
import bse.phin.tool.Itembluestonediamondpick;
import bse.phin.tool.Itembluestonediamondshear;
import bse.phin.tool.Itembluestonediamondshovel;
import bse.phin.tool.Itembluestonediamondsword;
import bse.phin.tool.Itembluestonehoe;
import bse.phin.tool.Itembluestonepick;
import bse.phin.tool.Itembluestoneshear;
import bse.phin.tool.Itembluestoneshovel;
import bse.phin.tool.Itembluestonesword;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "bse", name = "Blue Stone Energy's", version = "0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class core {
	
	
	public static final String modid = "Blue Stone Energy's";
	
	/* items */
	public static Item bluestonediamond;
	public static Item bluestonedust;
	public static Item bluestoneingot;
	public static Item bluestonestick;
	public static Item bluestonewooddust;
	public static Item bluestonediamondplate;
	
	/* blocks */
	public static Block bluestoneblock;
	public static Block bluestoneplank;
	public static Block chisledbluestone;
	public static Block bluestoneore;
	public static Block Bluestoneoredust;
	public static Block bluestonediamondore;
	public static Block bluestoneleaf;
	public static Block bluecobblestone;
	public static Block blueglowstone;
	public static Block bluestonefence;
	public static Block bluestonegravel;
	public static Block bluestonetorch;
	public static Block bluestonediamondblock;
	public static Block bluestonemachineblock;
	
	/*tools */
	public static Item bluestoneaxe;
	public static Item bluestonesword;
	public static Item bluestonepick;
	public static Item bluestoneshear;
	public static Item bluestonehoe;
	public static Item bluestoneshovel;
	
	/*diamond tools */
	public static Item bluestonediamondaxe;
	public static Item bluestonediamondsword;
	public static Item bluestonediamondpick;
	public static Item bluestonediamondshear;
	public static Item bluestonediamondhoe;
	public static Item bluestonediamondshovel;
	
	/* blueingot armour */
	public static Item bluestonehelmet;
	public static Item bluestonechestplate;
	public static Item bluestonepants;
	public static Item bluestoneboots;
	
	/* blue diamond armour */
	public static Item bluestonediamondhelmet;
	public static Item bluestonediamondchestplate;
	public static Item bluestonediamondpants;
	public static Item bluestonediamondboots;
	
	
	public static EnumArmorMaterial armorbluestonediamond = EnumHelper.addArmorMaterial("BLUESTONEDIAMOND", 40,  new int[]{3, 11, 9, 5}, 30);
	public static EnumArmorMaterial armorbluestoneingot = EnumHelper.addArmorMaterial("BLUESTONEINGOT", 19, new int[]{2, 6, 5, 3}, 15);                                          
	public static EnumToolMaterial toolbluestonediamond = EnumHelper.addToolMaterial("BLUESTONEDIAMOND", 3, 4000, 12.0F, 6, 30);
	public static EnumToolMaterial toolbluestoneingot = EnumHelper.addToolMaterial("BLUESTONEINGOT", 2, 2000, 6.0F, 3, 15);
	worldgen eventmanager = new worldgen();
	
	@Init
	public void load(FMLInitializationEvent event) {
	
		/*misc blocks ids 1000-1200*/
		bluestoneblock = new Blockbluestoneblock(1000, Material.rock).setUnlocalizedName("bluestoneblock").setHardness(2.5f);
		GameRegistry.registerBlock(bluestoneblock, modid + bluestoneblock.getUnlocalizedName());
		LanguageRegistry.addName(bluestoneblock, "Blue Stone Block");
		
		bluestoneingot = new Itembluestoneingot(1001).setUnlocalizedName("bluestoneingot");
		LanguageRegistry.addName(bluestoneingot, "Blue Stone Ingot");
		
		bluestoneplank = new Blockbluestoneplank(1002, Material.rock).setUnlocalizedName("bluestoneplank").setHardness(2f);
		GameRegistry.registerBlock(bluestoneplank, modid + bluestoneplank.getUnlocalizedName());
		LanguageRegistry.addName(bluestoneplank, "Blue Stone Plank");
		
		chisledbluestone = new Blockchisledbluestone(1003, Material.rock).setUnlocalizedName("chisledbluestone").setHardness(2.5f);
		GameRegistry.registerBlock(chisledbluestone, modid + chisledbluestone.getUnlocalizedName());
		LanguageRegistry.addName(chisledbluestone, "Chisled Blue Stone");
		
		bluestonedust = new Itembluestonedust(1004).setUnlocalizedName("bluestonedust");
		LanguageRegistry.addName(bluestonedust, "Blue Stone Dust");
		
		bluestoneore = new Blockbluestoneore(1005, Material.rock).setUnlocalizedName("bluestoneore").setHardness(2.5f);
		GameRegistry.registerBlock(bluestoneore, modid + bluestoneore.getUnlocalizedName());
		LanguageRegistry.addName(bluestoneore, "Blue Stone Ore");
		
		Bluestoneoredust = new Blockbluestoneoredust(1006, Material.rock).setUnlocalizedName("bluestoneoredust").setHardness(2.5f);
		GameRegistry.registerBlock(Bluestoneoredust, modid + Bluestoneoredust.getUnlocalizedName());
		LanguageRegistry.addName(Bluestoneoredust, "Blue Stone Ore Dust");
		
		bluestonediamondore = new Blockbluestonediamondore(1007, Material.rock).setUnlocalizedName("bluestonediamondore").setHardness(2.5f);                 
		GameRegistry.registerBlock(bluestonediamondore, modid + bluestonediamondore.getUnlocalizedName());
		LanguageRegistry.addName(bluestonediamondore, "Blue Stone Diamod Ore");
		
		bluestonediamond = new Itembluestonediamond(1008).setUnlocalizedName("bluestonediamond");
		LanguageRegistry.addName(bluestonediamond, "Blue Stone Diamond");
		
		GameRegistry.registerWorldGenerator(eventmanager);
		
		bluestoneleaf = new Blockbluestoneleaf(1009, Material.leaves).setUnlocalizedName("bluestoneleaf").setHardness(1.0f).setLightValue(90);                              
		GameRegistry.registerBlock(bluestoneleaf, modid + bluestoneleaf.getUnlocalizedName());
		LanguageRegistry.addName(bluestoneleaf, "Blue Stone Leaf");
		
		bluestonestick = new Itembluestonestick(1010).setUnlocalizedName("bluestonestick");
		LanguageRegistry.addName(bluestonestick, "Blue Stone Stick");
		
		bluestonewooddust = new Itembluestonewooddust(1011).setUnlocalizedName("bluestonewooddust");
		LanguageRegistry.addName(bluestonewooddust, "Blue Stone Wood Dust");
		
		bluecobblestone = new Blockbluecobblestone(1012, Material.rock).setUnlocalizedName("bluecobblestone").setHardness(2.5F);
		GameRegistry.registerBlock(bluecobblestone, modid + bluecobblestone.getUnlocalizedName());
		LanguageRegistry.addName(bluecobblestone, "Blue CobbleStone");
		
		blueglowstone = new Blockblueglowstone(1013, Material.rock).setUnlocalizedName("blueglowstone").setHardness(1.0F).setLightValue(1.0F).setLightOpacity(0);
		GameRegistry.registerBlock(blueglowstone, modid + blueglowstone.getUnlocalizedName());
		LanguageRegistry.addName(blueglowstone, "Blue Glow Stone");
		
		bluestonefence = new Blockbluestonefence(1014, Material.iron).setUnlocalizedName("bluestonefence").setHardness(1.5F);
		GameRegistry.registerBlock(bluestonefence, modid + bluestonefence.getUnlocalizedName());
		LanguageRegistry.addName(bluestonefence, "Blue Stone Fence");
		
		bluestonegravel = new Blockbluestonegravel(1015, Material.sand).setUnlocalizedName("bluestonegravel").setHardness(1.7F);
		GameRegistry.registerBlock(bluestonegravel, modid + bluestonegravel.getUnlocalizedName());
		LanguageRegistry.addName(bluestonegravel, "Blue Stone Gravel");
		
		bluestonetorch= new Blockbluestonetorch(1016, Material.wood).setUnlocalizedName("bluestonetorch").setHardness(1.5F).setLightOpacity(1).setLightValue(14);
		GameRegistry.registerBlock(bluestonetorch, modid + bluestonetorch.getUnlocalizedName());
		LanguageRegistry.addName(bluestonetorch, "Blue Stone Torch");
		
		bluestonediamondblock = new Blockbluestonediamondblock(1017, Material.rock).setUnlocalizedName("bluestonediamondblock").setHardness(2F);
		GameRegistry.registerBlock(bluestonediamondblock, modid + bluestonediamondblock.getUnlocalizedName());
		LanguageRegistry.addName(bluestonediamondblock, "Blue Stone Diamond Block");
		
		bluestonediamondplate = new Itembluestonediamondplate(1018).setUnlocalizedName("bluestonediamondplate");
		LanguageRegistry.addName(bluestonediamondplate, "Blue Stone Diamond Plate");
		
		bluestonemachineblock = new Blockbluestonemachineblock(1019,Material.rock).setUnlocalizedName("bluestonemachineblock").setHardness(2.0F);
		GameRegistry.registerBlock(bluestonemachineblock, modid + bluestonemachineblock.getUnlocalizedName());
		LanguageRegistry.addName(bluestonemachineblock, "Blue Stone Machine Block");
		
		
		
		
		//bluestone = new bluestone() 
		
		/*tools ids 1200-1350*/
		bluestoneaxe = new Itembluestoneaxe(1200, toolbluestoneingot).setUnlocalizedName("bluestoneaxe").setCreativeTab(CreativeTabs.tabTools);
		bluestonesword = new Itembluestonesword(1201, toolbluestoneingot).setUnlocalizedName("bluestonesword").setCreativeTab(CreativeTabs.tabCombat);
		bluestonepick = new Itembluestonepick(1202, toolbluestoneingot).setUnlocalizedName("bluestonepick").setCreativeTab(CreativeTabs.tabTools);
		bluestoneshear = new Itembluestoneshear(1203, toolbluestoneingot).setUnlocalizedName("bluestoneshear").setCreativeTab(CreativeTabs.tabTools);
		bluestonehoe = new Itembluestonehoe(1204, toolbluestoneingot).setUnlocalizedName("bluestonehoe").setCreativeTab(CreativeTabs.tabTools);
		bluestoneshovel = new Itembluestoneshovel(1205, toolbluestoneingot).setUnlocalizedName("bluestoneshovel").setCreativeTab(CreativeTabs.tabTools);
		bluestonediamondaxe = new Itembluestonediamondaxe(1206, toolbluestonediamond).setUnlocalizedName("bluestonediamondaxe").setCreativeTab(CreativeTabs.tabTools);
		bluestonediamondsword = new Itembluestonediamondsword(1207, toolbluestonediamond).setUnlocalizedName("bluestonediamondsword").setCreativeTab(CreativeTabs.tabCombat);
		bluestonediamondpick = new Itembluestonediamondpick(1208, toolbluestonediamond).setUnlocalizedName("bluestonediamondpick").setCreativeTab(CreativeTabs.tabTools);
		bluestonediamondshear = new Itembluestonediamondshear(1209, toolbluestonediamond).setUnlocalizedName("bluestonediamondshear").setCreativeTab(CreativeTabs.tabTools);
		bluestonediamondhoe = new Itembluestonediamondhoe(1210, toolbluestonediamond).setUnlocalizedName("bluestonediamondhoe").setCreativeTab(CreativeTabs.tabTools);
		bluestonediamondshovel = new Itembluestonediamondshovel(1211, toolbluestonediamond).setUnlocalizedName("bluestonediamondshovel").setCreativeTab(CreativeTabs.tabTools);
		
		bluestonehelmet = new Itembluestonehelmet(1212, armorbluestoneingot, 0, 0).setUnlocalizedName("bluestonehelmet").setCreativeTab(CreativeTabs.tabCombat);
		bluestonechestplate = new Itembluestonechestplate(1213, armorbluestoneingot, 1, 1).setUnlocalizedName("bluestonechestplate").setCreativeTab(CreativeTabs.tabCombat);
		bluestonepants = new Itembluestonepants(1214, armorbluestoneingot, 2, 2).setUnlocalizedName("bluestonepants").setCreativeTab(CreativeTabs.tabCombat);
		bluestoneboots = new Itembluestoneboots(1215, armorbluestoneingot, 3, 3).setUnlocalizedName("bluestoneboots").setCreativeTab(CreativeTabs.tabCombat);
		
		bluestonediamondhelmet = new Itembluestonediamondhelmet(1216, armorbluestonediamond, 0 , 0).setUnlocalizedName("bluestonediamondhelmet").setCreativeTab(CreativeTabs.tabCombat);
		bluestonediamondchestplate = new Itembluestonediamondchestplate(1217, armorbluestonediamond, 1 ,1).setUnlocalizedName("bluestonediamondchestplate").setCreativeTab(CreativeTabs.tabCombat);
		bluestonediamondpants = new Itembluestonediamondpants(1218, armorbluestonediamond, 2 ,2).setUnlocalizedName("bluestonediamondpants").setCreativeTab(CreativeTabs.tabCombat);
		bluestonediamondboots = new Itembluestonediamondboots(1219, armorbluestonediamond, 0, 0).setUnlocalizedName("bluestonediamondboots").setCreativeTab(CreativeTabs.tabCombat);
		
		
		
		/* tool names  + armor */
		LanguageRegistry.addName(bluestoneaxe, "Blue Stone Axe");
		LanguageRegistry.addName(bluestonesword, "Blue Stone Sword");
		LanguageRegistry.addName(bluestonepick, "Blue Stone PickAxe");
		LanguageRegistry.addName(bluestoneshear, "Blue Stone Shears");
		LanguageRegistry.addName(bluestonehoe, "Blue Stone Hoe");
		LanguageRegistry.addName(bluestoneshovel, "Blue Stone Shovel");
		LanguageRegistry.addName(bluestonediamondaxe, "Blue Stone Diamond Axe");
		LanguageRegistry.addName(bluestonediamondsword, "Blue Stone Diamond Sword");
		LanguageRegistry.addName(bluestonediamondpick, "Blue Stone Diamond PickAxe");
		LanguageRegistry.addName(bluestonediamondshear, "Blue Stone Diamond Shears");
		LanguageRegistry.addName(bluestonediamondhoe, "Blue Stone Diamond Hoe");
		LanguageRegistry.addName(bluestonediamondshovel, "Blue Stone Diamond Shovel");
		LanguageRegistry.addName(bluestonehelmet, "Blue Stone Helmet");
		LanguageRegistry.addName(bluestonechestplate, "Blue Stone Chestpeice");
		LanguageRegistry.addName(bluestonepants, "Blue Stone Pants");
		LanguageRegistry.addName(bluestoneboots, "Blue Stone Boots");
		LanguageRegistry.addName(bluestonediamondhelmet, "Blue Stone Diamond Helmet");
		LanguageRegistry.addName(bluestonediamondchestplate, "Blue Stone Diamond Chestpeice");
		LanguageRegistry.addName(bluestonediamondpants, "Blue Stone Diamond Pants");
		LanguageRegistry.addName(bluestonediamondboots, "Blue Stone Diamond Boots");
		
		
		
		/* smelting recipes*/
		GameRegistry.addSmelting(core.bluestoneore.blockID, new ItemStack(bluestoneingot), 4.0F);
		GameRegistry.addSmelting(core.bluestonedust.itemID, new ItemStack(bluestoneingot), 4.0F);
		GameRegistry.addSmelting(core.bluestoneingot.itemID, new ItemStack(bluestonedust), 4.0F);
		
		/* recipes */
		GameRegistry.addRecipe(new ItemStack(bluestoneblock,1), new Object[] { 
			"TTT", "TTT", "TTT", 'T' , bluestoneingot,
			});
		GameRegistry.addRecipe(new ItemStack(bluestonepick,1), new Object[] { 
			"TTT", " S ", " S ", 'T', bluestoneingot, 'S', bluestonestick,
			});
		GameRegistry.addRecipe(new ItemStack(bluestoneaxe,1), new Object[] { 
			"TT ", "TS ", " S ", 'S', bluestonestick, 'T', bluestoneingot,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonesword,1), new Object[] { 
			" T ", " T ", " S ", 'S', bluestonestick, 'T', bluestoneingot,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(bluestoneshear,1), new Object[] { 
			bluestoneingot,bluestoneingot
		});
		GameRegistry.addRecipe(new ItemStack(bluestonehoe,1), new Object[] { 
			"TT ", " S ", " S ", 'S', bluestonestick, 'T', bluestoneingot,
		});
		GameRegistry.addRecipe(new ItemStack(bluestoneshovel,1), new Object[] { 
			" T ", " S ", " S ", 'S', bluestonestick, 'T', bluestoneingot,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondaxe,1), new Object[] { 
			"TT ", "TS ", " S ", 'S', bluestonestick, 'T', bluestonediamond,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondsword,1), new Object[] { 
			" T ", " T ", " S ", 'S', bluestonestick, 'T', bluestonediamond,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondpick,1), new Object[] { 
			"TTT", " S ", " S ", 'S', bluestonestick, 'T', bluestonediamond,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(bluestonediamondshear,1), new Object[] { 
			bluestonediamond,bluestonediamond
		});
		GameRegistry.addRecipe(new ItemStack(bluestonechestplate,1), new Object[] { 
			"I I","III","III", 'I', bluestoneingot,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonepants, 1), new Object[] {
			"III", "I I", "I I", 'I', bluestoneingot,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonehelmet, 1), new Object[] {
			"III","I I",'I',bluestoneingot
		});
		GameRegistry.addRecipe(new ItemStack(bluestoneboots, 1), new Object[] {
			"I I","I I",'I',bluestoneingot
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondboots, 1), new Object[] {
			"I I","I I",'I',bluestonediamond
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondhelmet, 1), new Object[] {
			"III","I I",'I',bluestonediamond
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondpants, 1), new Object[] {
			"III", "I I", "I I", 'I', bluestonediamond,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondchestplate,1), new Object[] { 
			"I I","III","III", 'I', bluestonediamond,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(bluestoneingot, 9), new Object[] {
			bluestoneblock
		});
		GameRegistry.addRecipe(new ItemStack(bluestonestick, 4), new Object[] {
			"I  ","I  ", 'I',bluestoneplank
		});
		GameRegistry.addRecipe(new ItemStack(bluestonestick, 4), new Object[] {
			" I "," I ", 'I',bluestoneplank
		});
		GameRegistry.addRecipe(new ItemStack(bluestonestick, 4), new Object[] {
			"  I","  I", 'I',bluestoneplank
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondblock, 1), new Object[] {
			"III","III","III",'I',bluestonediamond
		});
		GameRegistry.addShapelessRecipe(new ItemStack(bluestonediamond, 9), new Object[] {
			bluestonediamondblock
		});
		GameRegistry.addRecipe(new ItemStack(bluestonediamondplate,1), new Object[] {
			"XXX","III","XXX", 'I', bluestoneingot, 'X', bluestonediamond,
		});
		GameRegistry.addRecipe(new ItemStack(bluestonemachineblock,1), new Object[] {
			"XXX","XDX","XXX", 'X', bluestoneingot, 'D', bluestonedust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(blueglowstone,1), new Object[] {
			bluestonedust,bluestonedust,bluestonedust,bluestonedust
		});
		
		
		
				
		
		
		
		
	
		
		
		
		
		
		
		
	}

	
		
		
		
	
			
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
