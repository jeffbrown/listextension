package util

class CollectionIdioms {
    static firstOrNull(List self) {
        return (self == null || self.isEmpty()) ? null :  self.first()
    }
}
