package com.lolzteam.codegen;

import java.util.List;

record OperationParameters(List<ParsedParameter> pathParams, List<ParsedParameter> queryParams) {
}
