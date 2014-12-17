package org.nrg.xdat.om.base;

import org.nrg.xdat.om.ExtPseudonymizedsubjectdata;
import org.nrg.xdat.om.XnatSubjectdata;
import org.nrg.xdat.om.base.auto.*;
import org.nrg.xdat.security.XDATUser;
import org.nrg.xft.*;
import org.nrg.xft.search.CriteriaCollection;
import org.nrg.xft.security.UserI;

import java.util.*;

/**
 * @author XDAT
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class BaseExtPseudonymizedsubjectdata extends
		AutoExtPseudonymizedsubjectdata {

	public BaseExtPseudonymizedsubjectdata(ItemI item) {
		super(item);
	}

	public BaseExtPseudonymizedsubjectdata(UserI user) {
		super(user);
	}

	/*
	 * @deprecated Use BaseExtPseudonymizedsubjectdata(UserI user)
	 */
	public BaseExtPseudonymizedsubjectdata() {
	}

	public BaseExtPseudonymizedsubjectdata(Hashtable properties, UserI user) {
		super(properties, user);
	}
	
	public static ExtPseudonymizedsubjectdata GetPseudonymizedSubjectByLabel(
			String label, XDATUser user, boolean preLoad) {
	
		CriteriaCollection cc1 = new CriteriaCollection("AND");
		cc1.addClause("xnat:subjectData/label", label);
	
		ArrayList al1 = XnatSubjectdata.getXnatSubjectdatasByField(cc1, user,
				preLoad);
		if (!al1.isEmpty()) {
			CriteriaCollection cc2 = new CriteriaCollection("AND");
			cc2.addClause("ext:pseudonymizedSubjectData/id",
					new XnatSubjectdata((ItemI) al1.get(0)).getId());
			ArrayList al2 = ExtPseudonymizedsubjectdata
					.getXnatSubjectdatasByField(cc2, user, preLoad);
			if (!al2.isEmpty())
				return new ExtPseudonymizedsubjectdata((ItemI) al2.get(0));
			else
				return null;
		} else {
			return null;
		}
	
	}

}
