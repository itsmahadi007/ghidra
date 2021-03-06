/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.graph.support;

import edu.uci.ics.jung.algorithms.layout.Layout;
import ghidra.graph.VisualGraph;
import ghidra.graph.graphs.TestEdge;
import ghidra.graph.graphs.AbstractTestVertex;
import ghidra.graph.viewer.layout.JungWrappingVisualGraphLayoutAdapter;

/**
 * A graph layout used for testing.
 */
public class TestGraphLayout extends JungWrappingVisualGraphLayoutAdapter<AbstractTestVertex, TestEdge> {

	public TestGraphLayout(Layout<AbstractTestVertex, TestEdge> jungLayout) {
		super(jungLayout);
	}

	@Override
	public TestGraphLayout cloneLayout(VisualGraph<AbstractTestVertex, TestEdge> newGraph) {

		Layout<AbstractTestVertex, TestEdge> newJungLayout = cloneJungLayout(newGraph);
		return new TestGraphLayout(newJungLayout);
	}
}
