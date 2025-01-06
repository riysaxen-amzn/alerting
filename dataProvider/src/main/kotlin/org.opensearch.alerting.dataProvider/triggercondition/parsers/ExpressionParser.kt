/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.alerting.dataProvider.triggercondition.parsers

import org.opensearch.alerting.dataProvider.triggercondition.*

interface ExpressionParser {
    fun parse(): TriggerExpressionResolver
}
