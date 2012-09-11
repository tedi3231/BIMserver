package org.bimserver.plugins.queryengine;

import org.bimserver.plugins.Reporter;
import org.bimserver.plugins.serializers.IfcModelInterface;

public interface QueryEngine {
	/**
	 * @param model The complete model
	 * @param code The query, represented as a string
	 * @return RunResult
	 */
	IfcModelInterface query(IfcModelInterface model, String code, Reporter reporter);
}