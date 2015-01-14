package org.nrg.xdat.om.base;

import java.util.ArrayList;
import java.util.Hashtable;

import org.nrg.xdat.om.ExtSubjectpseudonym;
import org.nrg.xdat.om.base.auto.AutoExtSubjectpseudonym;
import org.nrg.xdat.security.XDATUser;
import org.nrg.xft.ItemI;
import org.nrg.xft.search.CriteriaCollection;
import org.nrg.xft.security.UserI;

/**
 * @author XDAT
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class BaseExtSubjectpseudonym extends AutoExtSubjectpseudonym {

	public BaseExtSubjectpseudonym(ItemI item) {
		super(item);
	}

	public BaseExtSubjectpseudonym(UserI user) {
		super(user);
	}

	/*
	 * @deprecated Use BaseExtSubjectpseudonym(UserI user)
	 */
	public BaseExtSubjectpseudonym() {
	}

	public BaseExtSubjectpseudonym(Hashtable properties, UserI user) {
		super(properties, user);
	}

	public static ExtSubjectpseudonym GetPseudonym(String pseudonym, XDATUser user, boolean preLoad) {
		
		CriteriaCollection cc = new CriteriaCollection("AND");
		cc.addClause("ext:subjectPseudonym/id", pseudonym);

		ArrayList al = ExtSubjectpseudonym.getExtSubjectpseudonymsByField(cc, user, preLoad);
		if (!al.isEmpty()) {
			return new ExtSubjectpseudonym((ItemI) al.get(0));
		} else {
			return null;
		}

	}

}
