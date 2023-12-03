package proxy;

import java.util.HashMap;
import java.util.Map;

public class ContactListProxy implements ContactListIntrface {
    private Map<String, Contact> _cache = new HashMap<String, Contact>();
    private ContactList _realService;

    public ContactListProxy(ContactList contact) {
        this._realService = contact;
    }

    @Override
    public Contact getContact(String chave) {
        if (_cache.containsKey(chave)) {
            System.out.println("conteudo em cache: " + chave);
            return _cache.get(chave);
        } else {
            Contact aux = _realService.getContact(chave);
            if (aux != null) {
                if (_cache.size() == 5) {
                    // remove index mais antigo
                    int index = _cache.keySet().toArray().length - 1;
                    System.out.println("cache remove: " + _cache.keySet().toArray()[index]);
                    _cache.remove(_cache.keySet().toArray()[index]);

                }
                // storage of cache
                _cache.put(aux.getName(), aux);
            }

            return aux;
        }
    }

}
