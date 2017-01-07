package de.alsclo.voronoi.beachline;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BeachNode {

    private InnerBeachNode parent;

    public abstract InsertionResult insertArc(double siteX, double siteY);

    public abstract LeafBeachNode getLeftmostLeaf();
    public abstract LeafBeachNode getRightmostLeaf();
}
