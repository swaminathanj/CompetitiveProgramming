import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/*  In this example we have two class hierarchies. One of weapons and another one
 * of enchantments. We can easily combine any weapon with any enchantment using
 * composition instead of creating deep class hierarchy. */

public class Weapon_Enhance {

	private static final Logger LOGGER = LoggerFactory.getLogger(Weapon_Enhance.class);

	/**
	 * Program entry point
	 * 
	 * @param args
	 *            command line args
	 */
	public static void main(String[] args) {
		LOGGER.info("The knight receives an enchanted sword.");
		Sword enchantedSword = new Sword(new SoulEatingEnchantment());
		enchantedSword.wield();
		enchantedSword.swing();
		enchantedSword.unwield();

		LOGGER.info("The valkyrie receives an enchanted hammer.");
		Hammer hammer = new Hammer(new FlyingEnchantment());
		hammer.wield();
		hammer.swing();
		hammer.unwield();
	}
}


interface Enchantment {
	void onActivate();

	void apply();

	void onDeactivate();
}

class FlyingEnchantment implements Enchantment {
	private static final Logger LOGGER = LoggerFactory.getLogger(FlyingEnchantment.class);
	@Override
	public void onActivate() {
		LOGGER.info("The item begins to glow faintly.");
	}

	@Override
	public void apply() {
		LOGGER.info("The item flies and strikes the enemies finally returning to owner's hand.");
	}

	@Override
	public void onDeactivate() {
		LOGGER.info("The item's glow fades.");
	}
}


class Hammer implements Weapon {

	private final Enchantment enchantment;
	private static final Logger LOGGER = LoggerFactory.getLogger(Hammer.class);
	
	public Hammer(Enchantment enchantment) {
		this.enchantment = enchantment;
	}

	@Override
	public void wield() {
		LOGGER.info("The hammer is wielded.");
		enchantment.onActivate();
	}

	@Override
	public void swing() {
		LOGGER.info("The hammer is swinged.");
		enchantment.apply();
	}

	@Override
	public void unwield() {
		LOGGER.info("The hammer is unwielded.");
		enchantment.onDeactivate();
	}

	@Override
	public Enchantment getEnchantment() {
		return enchantment;
	}
}


class SoulEatingEnchantment implements Enchantment {
	private static final Logger LOGGER = LoggerFactory.getLogger(SoulEatingEnchantment.class);
	@Override
	public void onActivate() {
		LOGGER.info("The item spreads bloodlust.");
	}

	@Override
	public void apply() {
		LOGGER.info("The item eats the soul of enemies.");
	}

	@Override
	public void onDeactivate() {
		LOGGER.info("Bloodlust slowly disappears.");
	}
}


class Sword implements Weapon {

	private final Enchantment enchantment;
	private static final Logger LOGGER = LoggerFactory.getLogger(Sword.class);
	public Sword(Enchantment enchantment) {
		this.enchantment = enchantment;
	}

	@Override
	public void wield() {
		LOGGER.info("The sword is wielded.");
		enchantment.onActivate();
	}

	@Override
	public void swing() {
		LOGGER.info("The sword is swinged.");
		enchantment.apply();
	}

	@Override
	public void unwield() {
		LOGGER.info("The sword is unwielded.");
		enchantment.onDeactivate();
	}

	@Override
	public Enchantment getEnchantment() {
		return enchantment;
	}
}


interface Weapon {
	void wield();

	void swing();

	void unwield();

	Enchantment getEnchantment();
}