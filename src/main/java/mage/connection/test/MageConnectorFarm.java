package mage.connection.test;

import java.util.Objects;
import java.util.function.Supplier;

public enum MageConnectorFarm {
	V17(MageConnectorV17::new),
	V19(MageConnectorV19::new);

	public final Supplier<MageConnectorInterface> factory;
	
	private MageConnectorFarm(Supplier<MageConnectorInterface> factory){
        this.factory = Objects.requireNonNull(factory);
	}
}
