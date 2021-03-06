package cubex2.cs4.plugins.vanilla.crafting;

import cubex2.cs4.plugins.vanilla.DamageableShapelessOreRecipe;
import net.minecraft.init.Bootstrap;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import org.junit.BeforeClass;
import org.junit.Test;

public class CraftingManagerCS4Test
{
    @BeforeClass
    public static void setUp() throws Exception
    {
        Bootstrap.register();
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_addRecipe_vanilla() throws Exception
    {
        CraftingManagerCS4.addRecipe(new ResourceLocation("minecraft:vanilla"),
                                     new DamageableShapelessOreRecipe(new ResourceLocation("group"),
                                                                      new int[] {1},
                                                                      new ItemStack(Items.APPLE),
                                                                      Ingredient.fromItem(Items.APPLE)));
    }
}