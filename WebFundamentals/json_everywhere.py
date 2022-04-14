# Python has in built methods for JSON

import json

person = {"firstName":"Adam", "lastName":"Ranieri", "isTrainer":True}

json_string = json.dumps(person)
print(json_string)